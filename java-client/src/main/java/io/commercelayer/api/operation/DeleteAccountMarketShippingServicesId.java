package io.commercelayer.api.operation;

import io.commercelayer.api.model.MarketShippingService;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountMarketShippingServicesId
 */
public class DeleteAccountMarketShippingServicesId extends DeleteOperation<MarketShippingService> {

	public static final String OPERATION_PATH = "/account/market_shipping_services/{id}";


	public DeleteAccountMarketShippingServicesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountMarketShippingServicesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<MarketShippingService> getResourceType() {
		return MarketShippingService.class;
	}
	
}
