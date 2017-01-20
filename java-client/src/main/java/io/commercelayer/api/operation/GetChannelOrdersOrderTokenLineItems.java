package io.commercelayer.api.operation;

import io.commercelayer.api.model.LineItem;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetChannelOrdersOrderTokenLineItems
 */
public class GetChannelOrdersOrderTokenLineItems extends SearchOperation {

	public static final String OPERATION_PATH = "/channel/orders/{order_token}/line_items";


	public GetChannelOrdersOrderTokenLineItems() {
		super(OPERATION_PATH);
	}
	

	public void setOrderToken(Object orderToken) {
		addPathParam("order_token", orderToken);
	}
	

	public Object getOrderToken() {
		return getPathParam("order_token");
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return LineItem.class;
	}
	
}
