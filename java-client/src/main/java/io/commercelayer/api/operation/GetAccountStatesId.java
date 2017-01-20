package io.commercelayer.api.operation;

import io.commercelayer.api.model.State;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountStatesId
 */
public class GetAccountStatesId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/states/{id}";


	public GetAccountStatesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountStatesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return State.class;
	}
	
}
