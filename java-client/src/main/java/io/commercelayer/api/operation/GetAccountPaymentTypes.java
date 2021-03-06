package io.commercelayer.api.operation;

import io.commercelayer.api.model.PaymentType;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountPaymentTypes
 */
public class GetAccountPaymentTypes extends SearchOperation<PaymentType> {

	public static final String OPERATION_PATH = "/account/payment_types";


	public GetAccountPaymentTypes() {
		super(OPERATION_PATH);
	}
	

	public Class<PaymentType> getResourceType() {
		return PaymentType.class;
	}
	
}
