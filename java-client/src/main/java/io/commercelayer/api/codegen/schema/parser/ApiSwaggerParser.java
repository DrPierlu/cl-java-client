package io.commercelayer.api.codegen.schema.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.BooleanUtils;

import io.commercelayer.api.codegen.ApiCodegenException;
import io.commercelayer.api.codegen.schema.Definition;
import io.commercelayer.api.codegen.schema.Operation;
import io.commercelayer.api.codegen.schema.Parameter;
import io.commercelayer.api.codegen.schema.Property;
import io.commercelayer.api.codegen.schema.Resource;
import io.commercelayer.api.codegen.schema.Schema;
import io.commercelayer.api.util.ModelUtils;
import io.swagger.models.HttpMethod;
import io.swagger.models.Model;
import io.swagger.models.Path;
import io.swagger.models.Response;
import io.swagger.models.Swagger;
import io.swagger.models.parameters.AbstractParameter;
import io.swagger.models.parameters.AbstractSerializableParameter;
import io.swagger.models.properties.ArrayProperty;
import io.swagger.models.properties.RefProperty;
import io.swagger.parser.SwaggerParser;

public class ApiSwaggerParser extends ApiParser {
	
	public Schema parse(String schemaPath) throws ApiCodegenException {
		
		SwaggerParser parser = new SwaggerParser();

		Swagger swagger = null;
		
		try { swagger = parser.read(schemaPath); }
		catch (Exception e) { swagger = null; }
		if (swagger == null) throw new ApiCodegenException("Error reading Swagger Schema");

		Schema schema = new Schema();
		
		// Definitions
		logger.info("Parsing definitions ...");
		
		final Map<String, Model> definitions = swagger.getDefinitions();
		
		for (Map.Entry<String, Model> def : definitions.entrySet()) {
			
			Definition definition = new Definition();
			definition.setTitle(def.getKey());
			
			Map<String, io.swagger.models.properties.Property> properties = def.getValue().getProperties();
			for (Map.Entry<String, io.swagger.models.properties.Property> p : properties.entrySet()) {
				definition.addProperty(parseProperty(p.getKey(), p.getValue()));
			}
			
			schema.addDefinition(definition);
			
		}
			
		
		// Resources
		logger.info("Parsing resources ...");
		
		final Map<String, Path> paths = swagger.getPaths();
		
		for (Map.Entry<String, Path> path : paths.entrySet()) {
			
			Resource resource = new Resource();
			
			resource.setPath(path.getKey());
			
			Map<HttpMethod, io.swagger.models.Operation> operations = path.getValue().getOperationMap();
			for (Map.Entry<HttpMethod, io.swagger.models.Operation> opEntry : operations.entrySet()) {
				
				Operation operation = new Operation();
				
				final io.swagger.models.Operation op = opEntry.getValue();
				
				operation.setId(op.getOperationId());
				operation.setMethod(opEntry.getKey().name());
				
				// Reference
				for (Map.Entry<String, Response> res : op.getResponses().entrySet()) {
					RefProperty reference = (RefProperty)res.getValue().getSchema();
					if (reference == null) logger.warn("Operation without Schema Reference: {}", op.getOperationId());
					else
					if (reference.getSimpleRef() != null) {
						Definition def = schema.getDefinitions().get(reference.getSimpleRef());
						operation.setReference(def);
						def.addOperation(operation);
						break;
					}
				}
				
				// Parameters
				List<io.swagger.models.parameters.Parameter> params = op.getParameters();
				
				for (io.swagger.models.parameters.Parameter param : params) {
					operation.addParameter(parseParameter(param));
				}
				
				resource.addOperation(operation);
				
			}
			
			
			schema.addResource(resource);
			
		}
		
		
		evaluateRequiredFields(schema);
		
		
		logger.info("Schema parsed");
		
		return schema;

	}
	
	
	private void evaluateRequiredFields(Schema schema) {
		
		logger.info("Evaluating required fields ...");
		
		Map<String, List<String>> requiredObjectFields = new HashMap<>();
		
		// Collect required fields reading operations' details
		for (Resource res : schema.getResources()) {
			for (Operation op : res.getOperations()) {
				for (Parameter p : op.getParameters()) {
					
					if (!"formData".equals(p.getInputType())) continue;
					if (!p.isRequired()) continue;
					
					String oName = ModelUtils.getObjectName(p.getName(), true);
					String fName = ModelUtils.getObjectField(p.getName(), false);
					
					List<String> fieldList = requiredObjectFields.get(oName);
					if (fieldList == null) fieldList = new ArrayList<>();
					fieldList.add(fName);
					requiredObjectFields.put(oName, fieldList);
					
				}
			}
		}
		
		if (requiredObjectFields.isEmpty()) return;
		
		// Set required fields info
		for (Definition def : schema.getDefinitions().values()) {
			List<String> fieldList = requiredObjectFields.get(def.getTitle());
			if ((fieldList == null) || fieldList.isEmpty()) continue;
			for (Property p : def.getProperties()) {
				boolean required = fieldList.contains(p.getName());
				if (required) p.setRequired(true);
				if (!required) p.setReadonly(true);
			}
			
		}
		
	}

	
	private Property parseProperty(String propertyName, io.swagger.models.properties.Property p) {
		
		Property prop = new Property();
		
		prop.setName(propertyName);
		prop.setType(p.getType());
		prop.setFormat(p.getFormat());
		prop.setRequired(p.getRequired());
		prop.setReadonly(BooleanUtils.isTrue(p.getReadOnly()));
		prop.setDescription(p.getDescription());
		
		if (p instanceof ArrayProperty) {
			ArrayProperty ap = (ArrayProperty)p;
			prop.setItemType(ap.getItems().getType());
		}
		
		return prop;
		
	}

	
	private Parameter parseParameter(io.swagger.models.parameters.Parameter param) {
		
		Parameter parameter = new Parameter();
		
		parameter.setInputType(param.getIn());
		parameter.setDescription(param.getDescription());
		parameter.setRequired(param.getRequired());
		parameter.setAllowEmptyValue((param.getAllowEmptyValue() == null)? false : param.getAllowEmptyValue()); 
		
		if (param instanceof AbstractParameter) {
			AbstractParameter ap = (AbstractParameter)param;
			parameter.setName(ap.getName());
			parameter.setPattern(ap.getPattern());
		}
		
		if (ArrayUtils.contains(new String[]{"path", "formData", "query"}, parameter.getInputType())) {
			AbstractSerializableParameter<?> asp = (AbstractSerializableParameter<?>)param;
			parameter.setFormat(asp.getFormat());
			parameter.setType(asp.getType());
		}
		
		
		return parameter;
		
	}
		
}
