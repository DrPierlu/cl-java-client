package io.commercelayer.api.operation;

import io.commercelayer.api.model.CountryLanguage;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountCountryLanguagesIdMoveUp
 */
public class PutAccountCountryLanguagesIdMoveUp extends MoveOperation<CountryLanguage> {

	public static final String OPERATION_PATH = "/account/country_languages/{id}/move_up";


	public PutAccountCountryLanguagesIdMoveUp() {
		super(OPERATION_PATH);
	}
	

	public PutAccountCountryLanguagesIdMoveUp(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<CountryLanguage> getResourceType() {
		return CountryLanguage.class;
	}
	
}
