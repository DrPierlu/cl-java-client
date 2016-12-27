package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountStockLocationsId
 */
public class PutAccountStockLocationsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/stock_locations/{id}";


	public PutAccountStockLocationsId() {
		super(OPERATION_PATH);
	}
	
}