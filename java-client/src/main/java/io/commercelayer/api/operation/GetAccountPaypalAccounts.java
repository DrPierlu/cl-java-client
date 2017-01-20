package io.commercelayer.api.operation;

import io.commercelayer.api.model.PaypalAccount;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountPaypalAccounts
 */
public class GetAccountPaypalAccounts extends SearchOperation {

	public static final String OPERATION_PATH = "/account/paypal_accounts";


	public GetAccountPaypalAccounts() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return PaypalAccount.class;
	}
	
}
