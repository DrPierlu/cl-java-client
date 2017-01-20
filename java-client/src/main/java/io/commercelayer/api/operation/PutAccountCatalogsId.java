package io.commercelayer.api.operation;

import io.commercelayer.api.model.Catalog;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountCatalogsId
 */
public class PutAccountCatalogsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/catalogs/{id}";


	{
		addRequiredField("name");
		addRequiredField("description");
		addRequiredField("id");
	}


	public PutAccountCatalogsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountCatalogsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Catalog.class;
	}
	
}
