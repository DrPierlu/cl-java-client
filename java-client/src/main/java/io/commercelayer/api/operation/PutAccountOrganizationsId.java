package io.commercelayer.api.operation;

import io.commercelayer.api.model.Organization;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountOrganizationsId
 */
public class PutAccountOrganizationsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/organizations/{id}";


	{
		addRequiredField("name");
		addRequiredField("id");
	}


	public PutAccountOrganizationsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountOrganizationsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Organization.class;
	}
	
}
