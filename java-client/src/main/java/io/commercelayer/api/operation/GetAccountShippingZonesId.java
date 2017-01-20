package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingZone;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountShippingZonesId
 */
public class GetAccountShippingZonesId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/shipping_zones/{id}";


	public GetAccountShippingZonesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountShippingZonesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ShippingZone.class;
	}
	
}
