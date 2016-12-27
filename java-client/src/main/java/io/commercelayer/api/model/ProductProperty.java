package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * ProductProperty
 */
public class ProductProperty extends ApiResource {

	private static final long serialVersionUID = -1481927389167L;


	private Integer productId;
	private Integer propertyTypeId;
	private Integer propertyValueId;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object product;
	@JsonExclude
	private Object propertyType;
	@JsonExclude
	private Object propertyValue;


	public ProductProperty() {
		super();
	}
	

	public ProductProperty(Long id) {
		super(id);
	}
	

	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	

	public Integer getProductId() {
		return this.productId;
	}
	

	public void setPropertyTypeId(Integer propertyTypeId) {
		this.propertyTypeId = propertyTypeId;
	}
	

	public Integer getPropertyTypeId() {
		return this.propertyTypeId;
	}
	

	public void setPropertyValueId(Integer propertyValueId) {
		this.propertyValueId = propertyValueId;
	}
	

	public Integer getPropertyValueId() {
		return this.propertyValueId;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setProduct(Object product) {
		this.product = product;
	}
	

	public Object getProduct() {
		return this.product;
	}
	

	public void setPropertyType(Object propertyType) {
		this.propertyType = propertyType;
	}
	

	public Object getPropertyType() {
		return this.propertyType;
	}
	

	public void setPropertyValue(Object propertyValue) {
		this.propertyValue = propertyValue;
	}
	

	public Object getPropertyValue() {
		return this.propertyValue;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
	
		ProductProperty x = (ProductProperty) o;
	
		return super.equals(o) &&
			Objects.equals(this.productId, x.productId)  &&
			Objects.equals(this.propertyTypeId, x.propertyTypeId)  &&
			Objects.equals(this.propertyValueId, x.propertyValueId)  &&
			Objects.equals(this.previousChanges, x.previousChanges)  &&
			Objects.equals(this.product, x.product)  &&
			Objects.equals(this.propertyType, x.propertyType)  &&
			Objects.equals(this.propertyValue, x.propertyValue) 
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			serialVersionUID, resourceName, id, creatorResource, createdAt,
			updatedAt, productId, propertyTypeId, propertyValueId, previousChanges,
			product, propertyType, propertyValue 
		);
	
	}
	
}