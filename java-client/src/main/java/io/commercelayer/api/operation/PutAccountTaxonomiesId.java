package io.commercelayer.api.operation;

import io.commercelayer.api.model.Taxonomy;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountTaxonomiesId
 */
public class PutAccountTaxonomiesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/taxonomies/{id}";


	{
		addRequiredField("name");
		addRequiredField("id");
	}


	public PutAccountTaxonomiesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountTaxonomiesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Taxonomy.class;
	}
	
}
