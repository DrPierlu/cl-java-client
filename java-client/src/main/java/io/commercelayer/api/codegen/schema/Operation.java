package io.commercelayer.api.codegen.schema;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import io.commercelayer.api.http.HttpRequest.Method;

public class Operation {

	private Method method;
	private String id;
	private List<Parameter> parameters = new ArrayList<>();
	private Definition reference;


	public Method getMethod() {
		return method;
	}


	public void setMethod(Method method) {
		this.method = method;
	}


	public void setMethod(String method) {
		if (method != null) this.method = Method.valueOf(method.toUpperCase());
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public List<Parameter> getParameters() {
		return parameters;
	}


	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}


	public void addParameter(Parameter parameter) {
		this.parameters.add(parameter);
	}


	public Definition getReference() {
		return reference;
	}


	public void setReference(Definition reference) {
		this.reference = reference;
	}
	
	public String getName() {
		return StringUtils.capitalize(getId());
	}

}
