package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;

/**
 * VariantOption
 */
public class VariantOption extends ApiResource {

	private static final long serialVersionUID = -1482880735367L;


	@JsonExclude
	private String name;
	private Integer variantId;
	@JsonExclude
	private Integer optionTypeId;
	private Integer optionValueId;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object variant;
	@JsonExclude
	private Object optionType;
	@JsonExclude
	private Object optionValue;


	public VariantOption() {
		super();
	}
	

	public VariantOption(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public void setVariantId(Integer variantId) {
		this.variantId = variantId;
	}
	

	public Integer getVariantId() {
		return this.variantId;
	}
	

	public void setOptionTypeId(Integer optionTypeId) {
		this.optionTypeId = optionTypeId;
	}
	

	public Integer getOptionTypeId() {
		return this.optionTypeId;
	}
	

	public void setOptionValueId(Integer optionValueId) {
		this.optionValueId = optionValueId;
	}
	

	public Integer getOptionValueId() {
		return this.optionValueId;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setVariant(Object variant) {
		this.variant = variant;
	}
	

	public Object getVariant() {
		return this.variant;
	}
	

	public void setOptionType(Object optionType) {
		this.optionType = optionType;
	}
	

	public Object getOptionType() {
		return this.optionType;
	}
	

	public void setOptionValue(Object optionValue) {
		this.optionValue = optionValue;
	}
	

	public Object getOptionValue() {
		return this.optionValue;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		VariantOption x = (VariantOption)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.variantId, x.variantId)
			&& Objects.equals(this.optionTypeId, x.optionTypeId)
			&& Objects.equals(this.optionValueId, x.optionValueId)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.variant, x.variant)
			&& Objects.equals(this.optionType, x.optionType)
			&& Objects.equals(this.optionValue, x.optionValue)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, variantId, optionTypeId, optionValueId, previousChanges,
			variant, optionType, optionValue 
		);
	
	}
	

	@Override
	public VariantOption clone() {
	
		VariantOption no = new VariantOption();
	
		no.name = this.name;
		no.variantId = this.variantId;
		no.optionTypeId = this.optionTypeId;
		no.optionValueId = this.optionValueId;
		no.previousChanges = this.previousChanges;
		no.variant = this.variant;
		no.optionType = this.optionType;
		no.optionValue = this.optionValue;
	
		return no;
	
	}
	
}
