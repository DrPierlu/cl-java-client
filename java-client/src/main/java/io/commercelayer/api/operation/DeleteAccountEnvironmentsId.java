package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountEnvironmentsId
 */
public class DeleteAccountEnvironmentsId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/environments/{id}";


	public DeleteAccountEnvironmentsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountEnvironmentsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
