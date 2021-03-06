package io.commercelayer.api.operation;

import io.commercelayer.api.model.Gateway;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountGatewaysId
 */
public class PutAccountGatewaysId extends PutOperation<Gateway> {

	public static final String OPERATION_PATH = "/account/gateways/{id}";


	{
		addRequiredField("kind");
	}


	public PutAccountGatewaysId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountGatewaysId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Gateway> getResourceType() {
		return Gateway.class;
	}
	
}
