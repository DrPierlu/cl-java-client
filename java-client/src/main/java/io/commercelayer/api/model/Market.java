
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Market
 */
public class Market extends ApiResource {
	
	@SerializedName("environment_id")
	private String environmentId = null;

	@SerializedName("channel_id")
	private String channelId = null;

	@SerializedName("country_group_id")
	private String countryGroupId = null;

	@SerializedName("merchant_id")
	private String merchantId = null;

	@SerializedName("catalog_id")
	private String catalogId = null;

	@SerializedName("price_list_id")
	private String priceListId = null;

	@SerializedName("stock_location_id")
	private String stockLocationId = null;

	@SerializedName("order_validation_policy_id")
	private String orderValidationPolicyId = null;

	@SerializedName("creator_id")
	private String creatorId = null;

	@SerializedName("creator_resource")
	private String creatorResource = null;

	public Market environmentId(String environmentId) {
		this.environmentId = environmentId;
		return this;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

	public Market channelId(String channelId) {
		this.channelId = channelId;
		return this;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Market countryGroupId(String countryGroupId) {
		this.countryGroupId = countryGroupId;
		return this;
	}

	public String getCountryGroupId() {
		return countryGroupId;
	}

	public void setCountryGroupId(String countryGroupId) {
		this.countryGroupId = countryGroupId;
	}

	public Market merchantId(String merchantId) {
		this.merchantId = merchantId;
		return this;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public Market catalogId(String catalogId) {
		this.catalogId = catalogId;
		return this;
	}

	public String getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}

	public Market priceListId(String priceListId) {
		this.priceListId = priceListId;
		return this;
	}

	public String getPriceListId() {
		return priceListId;
	}

	public void setPriceListId(String priceListId) {
		this.priceListId = priceListId;
	}

	public Market stockLocationId(String stockLocationId) {
		this.stockLocationId = stockLocationId;
		return this;
	}

	public String getStockLocationId() {
		return stockLocationId;
	}

	public void setStockLocationId(String stockLocationId) {
		this.stockLocationId = stockLocationId;
	}

	public Market orderValidationPolicyId(String orderValidationPolicyId) {
		this.orderValidationPolicyId = orderValidationPolicyId;
		return this;
	}

	public String getOrderValidationPolicyId() {
		return orderValidationPolicyId;
	}

	public void setOrderValidationPolicyId(String orderValidationPolicyId) {
		this.orderValidationPolicyId = orderValidationPolicyId;
	}

	public Market creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public Market creatorResource(String creatorResource) {
		this.creatorResource = creatorResource;
		return this;
	}

	public String getCreatorResource() {
		return creatorResource;
	}

	public void setCreatorResource(String creatorResource) {
		this.creatorResource = creatorResource;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Market market = (Market) o;
		return Objects.equals(this.resourceName, market.resourceName) && Objects.equals(this.id, market.id)
				&& Objects.equals(this.environmentId, market.environmentId)
				&& Objects.equals(this.channelId, market.channelId)
				&& Objects.equals(this.countryGroupId, market.countryGroupId)
				&& Objects.equals(this.merchantId, market.merchantId)
				&& Objects.equals(this.catalogId, market.catalogId)
				&& Objects.equals(this.priceListId, market.priceListId)
				&& Objects.equals(this.stockLocationId, market.stockLocationId)
				&& Objects.equals(this.orderValidationPolicyId, market.orderValidationPolicyId)
				&& Objects.equals(this.creatorId, market.creatorId)
				&& Objects.equals(this.creatorResource, market.creatorResource)
				&& Objects.equals(this.createdAt, market.createdAt) && Objects.equals(this.updatedAt, market.updatedAt)
				&& Objects.equals(this.expanded, market.expanded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, environmentId, channelId, countryGroupId, merchantId, catalogId,
				priceListId, stockLocationId, orderValidationPolicyId, creatorId, creatorResource, createdAt, updatedAt,
				expanded);
	}

}
