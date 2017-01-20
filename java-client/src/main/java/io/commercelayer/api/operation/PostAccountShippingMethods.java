package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingMethod;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountShippingMethods
 */
public class PostAccountShippingMethods extends PostOperation {

	public static final String OPERATION_PATH = "/account/shipping_methods";


	{
		addRequiredField("orderId");
		addRequiredField("shippingServiceId");
		addRequiredField("shippingAddressId");
		addRequiredField("shippingPackageId");
		addRequiredField("orderDefault");
		addRequiredField("lineItemDefaultId");
	}


	public PostAccountShippingMethods() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ShippingMethod.class;
	}
	
}
