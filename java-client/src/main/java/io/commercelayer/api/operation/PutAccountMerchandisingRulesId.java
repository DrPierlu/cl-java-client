package io.commercelayer.api.operation;

import io.commercelayer.api.model.MerchandisingRule;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountMerchandisingRulesId
 */
public class PutAccountMerchandisingRulesId extends PutOperation<MerchandisingRule> {

	public static final String OPERATION_PATH = "/account/merchandising_rules/{id}";


	{
		addRequiredField("catalogId");
		addRequiredField("productId");
		addRequiredField("taxonId");
		addRequiredField("position");
		addRequiredField("hero");
	}


	public PutAccountMerchandisingRulesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountMerchandisingRulesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<MerchandisingRule> getResourceType() {
		return MerchandisingRule.class;
	}
	
}
