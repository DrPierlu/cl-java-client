package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * StockLocation
 */
public class StockLocation extends ApiResource {

	private static final long serialVersionUID = -1481927389272L;


	private String name;
	private Integer position;
	@JsonExclude
	private Object previousChanges;
	private List<String> stockItems;
	private List<String> lineItemStocks;
	private List<String> shippingServiceStockLocations;
	private List<String> shippingServices;


	public StockLocation() {
		super();
	}
	

	public StockLocation(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public void setPosition(Integer position) {
		this.position = position;
	}
	

	public Integer getPosition() {
		return this.position;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setStockItems(List<String> stockItems) {
		this.stockItems = stockItems;
	}
	

	public List<String> getStockItems() {
		return this.stockItems;
	}
	

	public void setLineItemStocks(List<String> lineItemStocks) {
		this.lineItemStocks = lineItemStocks;
	}
	

	public List<String> getLineItemStocks() {
		return this.lineItemStocks;
	}
	

	public void setShippingServiceStockLocations(List<String> shippingServiceStockLocations) {
		this.shippingServiceStockLocations = shippingServiceStockLocations;
	}
	

	public List<String> getShippingServiceStockLocations() {
		return this.shippingServiceStockLocations;
	}
	

	public void setShippingServices(List<String> shippingServices) {
		this.shippingServices = shippingServices;
	}
	

	public List<String> getShippingServices() {
		return this.shippingServices;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		StockLocation x = (StockLocation) o;
	
		return super.equals(o) &&
			Objects.equals(this.name, x.name)  &&
			Objects.equals(this.position, x.position)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.stockItems, x.stockItems)  &&
			Objects.equals(this.lineItemStocks, x.lineItemStocks)  &&
			Objects.equals(this.shippingServiceStockLocations, x.shippingServiceStockLocations)  &&
			Objects.equals(this.shippingServices, x.shippingServices) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, name, position, previousChanges, stockItems,
			lineItemStocks, shippingServiceStockLocations, shippingServices 
		);
	
	}
	
}
