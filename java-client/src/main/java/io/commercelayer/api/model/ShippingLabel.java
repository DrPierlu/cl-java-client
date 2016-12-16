package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * ShippingLabel
 */
public class ShippingLabel extends ApiResource {

	private static final long serialVersionUID = -1481927389230L;


	private Integer shipmentId;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object shipment;


	public ShippingLabel() {
		super();
	}
	

	public ShippingLabel(Long id) {
		super(id);
	}
	

	public void setShipmentId(Integer shipmentId) {
		this.shipmentId = shipmentId;
	}
	

	public Integer getShipmentId() {
		return this.shipmentId;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setShipment(Object shipment) {
		this.shipment = shipment;
	}
	

	public Object getShipment() {
		return this.shipment;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		ShippingLabel x = (ShippingLabel) o;
	
		return super.equals(o) &&
			Objects.equals(this.shipmentId, x.shipmentId)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.shipment, x.shipment) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, shipmentId, previousChanges, shipment 
		);
	
	}
	
}
