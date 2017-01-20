package io.commercelayer.api.operation;

import io.commercelayer.api.model.User;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountUsersId
 */
public class GetAccountUsersId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/users/{id}";


	public GetAccountUsersId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountUsersId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return User.class;
	}
	
}
