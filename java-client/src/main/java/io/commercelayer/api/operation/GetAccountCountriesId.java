package io.commercelayer.api.operation;

import io.commercelayer.api.model.Country;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountCountriesId
 */
public class GetAccountCountriesId extends GetIdOperation<Country> {

	public static final String OPERATION_PATH = "/account/countries/{id}";


	public GetAccountCountriesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountCountriesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Country> getResourceType() {
		return Country.class;
	}
	
}
