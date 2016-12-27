package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountShippingServiceStockLocationsId
 */
public class PutAccountShippingServiceStockLocationsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/shipping_service_stock_locations/{id}";


	public PutAccountShippingServiceStockLocationsId() {
		super(OPERATION_PATH);
	}
	
}