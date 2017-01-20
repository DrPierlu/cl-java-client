package io.commercelayer.api.operation;

import io.commercelayer.api.model.Role;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountRoles
 */
public class PostAccountRoles extends PostOperation {

	public static final String OPERATION_PATH = "/account/roles";


	{
		addRequiredField("name");
		addRequiredField("description");
	}


	public PostAccountRoles() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Role.class;
	}
	
}
