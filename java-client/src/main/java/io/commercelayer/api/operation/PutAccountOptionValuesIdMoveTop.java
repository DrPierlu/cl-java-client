package io.commercelayer.api.operation;

import io.commercelayer.api.model.OptionValue;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountOptionValuesIdMoveTop
 */
public class PutAccountOptionValuesIdMoveTop extends MoveOperation<OptionValue> {

	public static final String OPERATION_PATH = "/account/option_values/{id}/move_top";


	public PutAccountOptionValuesIdMoveTop() {
		super(OPERATION_PATH);
	}
	

	public PutAccountOptionValuesIdMoveTop(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<OptionValue> getResourceType() {
		return OptionValue.class;
	}
	
}
