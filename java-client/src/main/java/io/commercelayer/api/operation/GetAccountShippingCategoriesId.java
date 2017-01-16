package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountShippingCategoriesId
 */
public class GetAccountShippingCategoriesId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/shipping_categories/{id}";


	public GetAccountShippingCategoriesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountShippingCategoriesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
