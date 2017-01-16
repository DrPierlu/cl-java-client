package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountPropertyValuesIdMoveDown
 */
public class PutAccountPropertyValuesIdMoveDown extends MoveOperation {

	public static final String OPERATION_PATH = "/account/property_values/{id}/move_down";


	public PutAccountPropertyValuesIdMoveDown() {
		super(OPERATION_PATH);
	}
	

	public PutAccountPropertyValuesIdMoveDown(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
