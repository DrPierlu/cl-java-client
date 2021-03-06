package io.commercelayer.api.operation;

import io.commercelayer.api.model.MerchandisingRule;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountMerchandisingRulesId
 */
public class GetAccountMerchandisingRulesId extends GetIdOperation<MerchandisingRule> {

	public static final String OPERATION_PATH = "/account/merchandising_rules/{id}";


	public GetAccountMerchandisingRulesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountMerchandisingRulesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<MerchandisingRule> getResourceType() {
		return MerchandisingRule.class;
	}
	
}
