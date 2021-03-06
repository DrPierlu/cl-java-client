package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingMethod;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostChannelLineItemsLineItemIdShippingMethods
 */
public class PostChannelLineItemsLineItemIdShippingMethods extends PostOperation<ShippingMethod> {

	public static final String OPERATION_PATH = "/channel/line_items/{line_item_id}/shipping_methods";


	{
		addRequiredField("shippingServiceId");
		addRequiredField("shippingPackageId");
		addRequiredField("shipmentIds");
		addRequiredField("lineItemIds");
		addRequiredField("shippingAddressAttributes");
		addRequiredField("shippingAddressId");
	}


	public PostChannelLineItemsLineItemIdShippingMethods() {
		super(OPERATION_PATH);
	}
	

	public void setLineItemId(Object lineItemId) {
		addPathParam("line_item_id", lineItemId);
	}
	

	public Object getLineItemId() {
		return getPathParam("line_item_id");
	}
	

	public Class<ShippingMethod> getResourceType() {
		return ShippingMethod.class;
	}
	
}
