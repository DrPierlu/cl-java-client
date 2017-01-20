package io.commercelayer.api.operation;

import io.commercelayer.api.model.ProductProperty;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountProductProperties
 */
public class PostAccountProductProperties extends PostOperation {

	public static final String OPERATION_PATH = "/account/product_properties";


	{
		addRequiredField("productId");
		addRequiredField("propertyValueId");
	}


	public PostAccountProductProperties() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ProductProperty.class;
	}
	
}
