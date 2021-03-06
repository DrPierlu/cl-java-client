package io.commercelayer.api.operation;

import io.commercelayer.api.model.Role;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountRoles
 */
public class PostAccountRoles extends PostOperation<Role> {

	public static final String OPERATION_PATH = "/account/roles";


	{
		addRequiredField("name");
		addRequiredField("description");
		addRequiredField("consumerRoleIds");
		addRequiredField("permissionIds");
		addRequiredField("consumerIds");
	}


	public PostAccountRoles() {
		super(OPERATION_PATH);
	}
	

	public Class<Role> getResourceType() {
		return Role.class;
	}
	
}
