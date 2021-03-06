package io.commercelayer.api.operation;

import io.commercelayer.api.model.OptionValue;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountOptionValuesIdMoveDown
 */
public class PutAccountOptionValuesIdMoveDown extends MoveOperation<OptionValue> {

	public static final String OPERATION_PATH = "/account/option_values/{id}/move_down";


	public PutAccountOptionValuesIdMoveDown() {
		super(OPERATION_PATH);
	}
	

	public PutAccountOptionValuesIdMoveDown(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<OptionValue> getResourceType() {
		return OptionValue.class;
	}
	
}
