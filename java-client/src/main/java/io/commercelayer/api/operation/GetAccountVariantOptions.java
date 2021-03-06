package io.commercelayer.api.operation;

import io.commercelayer.api.model.VariantOption;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountVariantOptions
 */
public class GetAccountVariantOptions extends SearchOperation<VariantOption> {

	public static final String OPERATION_PATH = "/account/variant_options";


	public GetAccountVariantOptions() {
		super(OPERATION_PATH);
	}
	

	public Class<VariantOption> getResourceType() {
		return VariantOption.class;
	}
	
}
