package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.GetIdOperation;

/**
 * GetAccountMarketPaymentTypesId
 */
public class GetAccountMarketPaymentTypesId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/market_payment_types/{id}";


	public GetAccountMarketPaymentTypesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountMarketPaymentTypesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}