package io.commercelayer.api.operation;

import io.commercelayer.api.model.Address;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountAddressesId
 */
public class GetAccountAddressesId extends GetIdOperation<Address> {

	public static final String OPERATION_PATH = "/account/addresses/{id}";


	public GetAccountAddressesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountAddressesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Address> getResourceType() {
		return Address.class;
	}
	
}
