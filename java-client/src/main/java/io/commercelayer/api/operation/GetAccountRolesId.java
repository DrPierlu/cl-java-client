package io.commercelayer.api.operation;

import io.commercelayer.api.model.Role;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountRolesId
 */
public class GetAccountRolesId extends GetIdOperation<Role> {

	public static final String OPERATION_PATH = "/account/roles/{id}";


	public GetAccountRolesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountRolesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Role> getResourceType() {
		return Role.class;
	}
	
}
