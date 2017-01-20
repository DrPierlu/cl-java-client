package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingPackage;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountShippingPackagesId
 */
public class PutAccountShippingPackagesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/shipping_packages/{id}";


	{
		addRequiredField("name");
		addRequiredField("id");
	}


	public PutAccountShippingPackagesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountShippingPackagesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ShippingPackage.class;
	}
	
}
