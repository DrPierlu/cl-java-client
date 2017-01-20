package io.commercelayer.api.operation;

import io.commercelayer.api.model.MarketStockLocation;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountMarketStockLocationsId
 */
public class DeleteAccountMarketStockLocationsId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/market_stock_locations/{id}";


	public DeleteAccountMarketStockLocationsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountMarketStockLocationsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return MarketStockLocation.class;
	}
	
}
