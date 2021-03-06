package io.commercelayer.api.operation;

import io.commercelayer.api.model.Taxonomy;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountTaxonomiesId
 */
public class GetAccountTaxonomiesId extends GetIdOperation<Taxonomy> {

	public static final String OPERATION_PATH = "/account/taxonomies/{id}";


	public GetAccountTaxonomiesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountTaxonomiesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Taxonomy> getResourceType() {
		return Taxonomy.class;
	}
	
}
