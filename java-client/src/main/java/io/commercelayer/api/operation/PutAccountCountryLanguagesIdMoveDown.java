package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountCountryLanguagesIdMoveDown
 */
public class PutAccountCountryLanguagesIdMoveDown extends MoveOperation {

	public static final String OPERATION_PATH = "/account/country_languages/{id}/move_down";


	public PutAccountCountryLanguagesIdMoveDown() {
		super(OPERATION_PATH);
	}
	

	public PutAccountCountryLanguagesIdMoveDown(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
