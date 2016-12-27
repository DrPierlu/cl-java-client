package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountMerchandisingRulesId
 */
public class PutAccountMerchandisingRulesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/merchandising_rules/{id}";


	public PutAccountMerchandisingRulesId() {
		super(OPERATION_PATH);
	}
	
}