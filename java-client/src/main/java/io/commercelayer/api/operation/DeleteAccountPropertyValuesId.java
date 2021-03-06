package io.commercelayer.api.operation;

import io.commercelayer.api.model.PropertyValue;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountPropertyValuesId
 */
public class DeleteAccountPropertyValuesId extends DeleteOperation<PropertyValue> {

	public static final String OPERATION_PATH = "/account/property_values/{id}";


	public DeleteAccountPropertyValuesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountPropertyValuesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<PropertyValue> getResourceType() {
		return PropertyValue.class;
	}
	
}
