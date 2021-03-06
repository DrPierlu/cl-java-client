package io.commercelayer.api.operation;

import io.commercelayer.api.model.CountryGroup;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountCountryGroups
 */
public class GetAccountCountryGroups extends SearchOperation<CountryGroup> {

	public static final String OPERATION_PATH = "/account/country_groups";


	public GetAccountCountryGroups() {
		super(OPERATION_PATH);
	}
	

	public Class<CountryGroup> getResourceType() {
		return CountryGroup.class;
	}
	
}
