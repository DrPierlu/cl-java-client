package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountTransactionsId
 */
public class DeleteAccountTransactionsId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/transactions/{id}";


	public DeleteAccountTransactionsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountTransactionsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
