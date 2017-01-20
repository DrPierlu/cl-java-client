package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingServiceStockLocation;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountShippingServiceStockLocationsId
 */
public class GetAccountShippingServiceStockLocationsId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/shipping_service_stock_locations/{id}";


	public GetAccountShippingServiceStockLocationsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountShippingServiceStockLocationsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ShippingServiceStockLocation.class;
	}
	
}
