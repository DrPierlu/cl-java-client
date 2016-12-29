package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;

/**
 * Product
 */
public class Product extends ApiResource {

	private static final long serialVersionUID = -1483006114322L;


	private String name;
	private String productTypeId;
	@JsonExclude
	private String description;
	@JsonExclude
	private String hasVariants;
	@JsonExclude
	private List<String> images;
	@JsonExclude
	private List<String> lineItemStocks;
	@JsonExclude
	private List<String> lineItems;
	@JsonExclude
	private List<String> merchandisingRules;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> prices;
	@JsonExclude
	private List<String> productProperties;
	@JsonExclude
	private Object productType;
	@JsonExclude
	private List<String> resourceImages;
	@JsonExclude
	private Object shippingCategory;
	@JsonExclude
	private String shippingCategoryId;
	@JsonExclude
	private List<String> shippingServiceStockLocations;
	@JsonExclude
	private List<String> stockItems;
	@JsonExclude
	private String taxCode;
	@JsonExclude
	private String trackInventory;
	@JsonExclude
	private List<String> translations;
	@JsonExclude
	private List<String> variants;


	public Product() {
		super();
	}
	

	public Product(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public Product name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setDescription(String description) {
		this.description = description;
	}
	

	public String getDescription() {
		return this.description;
	}
	

	public Product description(String description) {
		setDescription(description);
		return this;
	}
	

	public String description() {
		return getDescription();
	}
	

	public void setProductTypeId(String productTypeId) {
		this.productTypeId = productTypeId;
	}
	

	public String getProductTypeId() {
		return this.productTypeId;
	}
	

	public Product productTypeId(String productTypeId) {
		setProductTypeId(productTypeId);
		return this;
	}
	

	public String productTypeId() {
		return getProductTypeId();
	}
	

	public void setTrackInventory(String trackInventory) {
		this.trackInventory = trackInventory;
	}
	

	public String getTrackInventory() {
		return this.trackInventory;
	}
	

	public Product trackInventory(String trackInventory) {
		setTrackInventory(trackInventory);
		return this;
	}
	

	public String trackInventory() {
		return getTrackInventory();
	}
	

	public void setShippingCategoryId(String shippingCategoryId) {
		this.shippingCategoryId = shippingCategoryId;
	}
	

	public String getShippingCategoryId() {
		return this.shippingCategoryId;
	}
	

	public Product shippingCategoryId(String shippingCategoryId) {
		setShippingCategoryId(shippingCategoryId);
		return this;
	}
	

	public String shippingCategoryId() {
		return getShippingCategoryId();
	}
	

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}
	

	public String getTaxCode() {
		return this.taxCode;
	}
	

	public Product taxCode(String taxCode) {
		setTaxCode(taxCode);
		return this;
	}
	

	public String taxCode() {
		return getTaxCode();
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public Product previousChanges(Object previousChanges) {
		setPreviousChanges(previousChanges);
		return this;
	}
	

	public Object previousChanges() {
		return getPreviousChanges();
	}
	

	public void setShippingCategory(Object shippingCategory) {
		this.shippingCategory = shippingCategory;
	}
	

	public Object getShippingCategory() {
		return this.shippingCategory;
	}
	

	public Product shippingCategory(Object shippingCategory) {
		setShippingCategory(shippingCategory);
		return this;
	}
	

	public Object shippingCategory() {
		return getShippingCategory();
	}
	

	public void setProductType(Object productType) {
		this.productType = productType;
	}
	

	public Object getProductType() {
		return this.productType;
	}
	

	public Product productType(Object productType) {
		setProductType(productType);
		return this;
	}
	

	public Object productType() {
		return getProductType();
	}
	

	public void setPrices(List<String> prices) {
		this.prices = prices;
	}
	

	public List<String> getPrices() {
		return this.prices;
	}
	

	public Product prices(List<String> prices) {
		setPrices(prices);
		return this;
	}
	

	public List<String> prices() {
		return getPrices();
	}
	

	public void setLineItems(List<String> lineItems) {
		this.lineItems = lineItems;
	}
	

	public List<String> getLineItems() {
		return this.lineItems;
	}
	

	public Product lineItems(List<String> lineItems) {
		setLineItems(lineItems);
		return this;
	}
	

	public List<String> lineItems() {
		return getLineItems();
	}
	

	public void setLineItemStocks(List<String> lineItemStocks) {
		this.lineItemStocks = lineItemStocks;
	}
	

	public List<String> getLineItemStocks() {
		return this.lineItemStocks;
	}
	

	public Product lineItemStocks(List<String> lineItemStocks) {
		setLineItemStocks(lineItemStocks);
		return this;
	}
	

	public List<String> lineItemStocks() {
		return getLineItemStocks();
	}
	

	public void setStockItems(List<String> stockItems) {
		this.stockItems = stockItems;
	}
	

	public List<String> getStockItems() {
		return this.stockItems;
	}
	

	public Product stockItems(List<String> stockItems) {
		setStockItems(stockItems);
		return this;
	}
	

	public List<String> stockItems() {
		return getStockItems();
	}
	

	public void setShippingServiceStockLocations(List<String> shippingServiceStockLocations) {
		this.shippingServiceStockLocations = shippingServiceStockLocations;
	}
	

	public List<String> getShippingServiceStockLocations() {
		return this.shippingServiceStockLocations;
	}
	

	public Product shippingServiceStockLocations(List<String> shippingServiceStockLocations) {
		setShippingServiceStockLocations(shippingServiceStockLocations);
		return this;
	}
	

	public List<String> shippingServiceStockLocations() {
		return getShippingServiceStockLocations();
	}
	

	public void setResourceImages(List<String> resourceImages) {
		this.resourceImages = resourceImages;
	}
	

	public List<String> getResourceImages() {
		return this.resourceImages;
	}
	

	public Product resourceImages(List<String> resourceImages) {
		setResourceImages(resourceImages);
		return this;
	}
	

	public List<String> resourceImages() {
		return getResourceImages();
	}
	

	public void setImages(List<String> images) {
		this.images = images;
	}
	

	public List<String> getImages() {
		return this.images;
	}
	

	public Product images(List<String> images) {
		setImages(images);
		return this;
	}
	

	public List<String> images() {
		return getImages();
	}
	

	public void setTranslations(List<String> translations) {
		this.translations = translations;
	}
	

	public List<String> getTranslations() {
		return this.translations;
	}
	

	public Product translations(List<String> translations) {
		setTranslations(translations);
		return this;
	}
	

	public List<String> translations() {
		return getTranslations();
	}
	

	public void setVariants(List<String> variants) {
		this.variants = variants;
	}
	

	public List<String> getVariants() {
		return this.variants;
	}
	

	public Product variants(List<String> variants) {
		setVariants(variants);
		return this;
	}
	

	public List<String> variants() {
		return getVariants();
	}
	

	public void setMerchandisingRules(List<String> merchandisingRules) {
		this.merchandisingRules = merchandisingRules;
	}
	

	public List<String> getMerchandisingRules() {
		return this.merchandisingRules;
	}
	

	public Product merchandisingRules(List<String> merchandisingRules) {
		setMerchandisingRules(merchandisingRules);
		return this;
	}
	

	public List<String> merchandisingRules() {
		return getMerchandisingRules();
	}
	

	public void setProductProperties(List<String> productProperties) {
		this.productProperties = productProperties;
	}
	

	public List<String> getProductProperties() {
		return this.productProperties;
	}
	

	public Product productProperties(List<String> productProperties) {
		setProductProperties(productProperties);
		return this;
	}
	

	public List<String> productProperties() {
		return getProductProperties();
	}
	

	public void setHasVariants(String hasVariants) {
		this.hasVariants = hasVariants;
	}
	

	public String getHasVariants() {
		return this.hasVariants;
	}
	

	public Product hasVariants(String hasVariants) {
		setHasVariants(hasVariants);
		return this;
	}
	

	public String hasVariants() {
		return getHasVariants();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Product x = (Product)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.description, x.description)
			&& Objects.equals(this.productTypeId, x.productTypeId)
			&& Objects.equals(this.trackInventory, x.trackInventory)
			&& Objects.equals(this.shippingCategoryId, x.shippingCategoryId)
			&& Objects.equals(this.taxCode, x.taxCode)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.shippingCategory, x.shippingCategory)
			&& Objects.equals(this.productType, x.productType)
			&& Objects.equals(this.prices, x.prices)
			&& Objects.equals(this.lineItems, x.lineItems)
			&& Objects.equals(this.lineItemStocks, x.lineItemStocks)
			&& Objects.equals(this.stockItems, x.stockItems)
			&& Objects.equals(this.shippingServiceStockLocations, x.shippingServiceStockLocations)
			&& Objects.equals(this.resourceImages, x.resourceImages)
			&& Objects.equals(this.images, x.images)
			&& Objects.equals(this.translations, x.translations)
			&& Objects.equals(this.variants, x.variants)
			&& Objects.equals(this.merchandisingRules, x.merchandisingRules)
			&& Objects.equals(this.productProperties, x.productProperties)
			&& Objects.equals(this.hasVariants, x.hasVariants)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, description, productTypeId, trackInventory, shippingCategoryId,
			taxCode, previousChanges, shippingCategory, productType, prices,
			lineItems, lineItemStocks, stockItems, shippingServiceStockLocations, resourceImages,
			images, translations, variants, merchandisingRules, productProperties,
			hasVariants 
		);
	
	}
	

	@Override
	public Product clone() {
	
		Product no = new Product();
	
		no.name = this.name;
		no.description = this.description;
		no.productTypeId = this.productTypeId;
		no.trackInventory = this.trackInventory;
		no.shippingCategoryId = this.shippingCategoryId;
		no.taxCode = this.taxCode;
		no.previousChanges = this.previousChanges;
		no.shippingCategory = this.shippingCategory;
		no.productType = this.productType;
		no.prices = this.prices;
		no.lineItems = this.lineItems;
		no.lineItemStocks = this.lineItemStocks;
		no.stockItems = this.stockItems;
		no.shippingServiceStockLocations = this.shippingServiceStockLocations;
		no.resourceImages = this.resourceImages;
		no.images = this.images;
		no.translations = this.translations;
		no.variants = this.variants;
		no.merchandisingRules = this.merchandisingRules;
		no.productProperties = this.productProperties;
		no.hasVariants = this.hasVariants;
	
		return no;
	
	}
	
}
