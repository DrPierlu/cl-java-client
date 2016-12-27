package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Order
 */
public class Order extends ApiResource {

	private static final long serialVersionUID = -1482880735307L;


	@JsonExclude
	private String name;
	@JsonExclude
	private Integer customerId;
	@JsonExclude
	private Integer merchantId;
	private Integer channelId;
	private Integer countryId;
	@JsonExclude
	private Integer marketId;
	@JsonExclude
	private Integer currencyId;
	@JsonExclude
	private String token;
	@JsonExclude
	private Object taxIncluded;
	@JsonExclude
	private Float taxRate;
	@JsonExclude
	private Object hasNexus;
	@JsonExclude
	private Object shippingMethodTaxable;
	@JsonExclude
	private Object paymentMethodTaxable;
	@JsonExclude
	private String taxSource;
	@JsonExclude
	private LocalDateTime placedAt;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private Object customer;
	@JsonExclude
	private Object channel;
	@JsonExclude
	private Object country;
	@JsonExclude
	private Object market;
	@JsonExclude
	private Object merchant;
	@JsonExclude
	private Object currency;
	@JsonExclude
	private List<String> lineItems;
	@JsonExclude
	private List<String> lineItemStocks;
	@JsonExclude
	private List<String> paymentMethods;
	@JsonExclude
	private List<String> shippingMethods;
	@JsonExclude
	private List<String> shipments;
	@JsonExclude
	private List<String> transactions;
	@JsonExclude
	private List<String> marketPaymentTypes;
	@JsonExclude
	private List<String> paymentTypes;
	@JsonExclude
	private List<String> marketShippingServices;
	@JsonExclude
	private List<String> shippingServices;
	@JsonExclude
	private String totalAmountWithTax;
	@JsonExclude
	private String formattedTotalAmountWithTax;
	@JsonExclude
	private String totalAmount;
	@JsonExclude
	private String formattedTotalAmount;
	@JsonExclude
	private String totalLineItemAmount;
	@JsonExclude
	private String formattedTotalLineItemAmount;
	@JsonExclude
	private String totalShippingMethodAmount;
	@JsonExclude
	private String formattedTotalShippingMethodAmount;
	@JsonExclude
	private String totalPaymentMethodPrice;
	@JsonExclude
	private String formattedTotalPaymentMethodPrice;
	@JsonExclude
	private String totalAmountWithPaymentMethodRequired;
	@JsonExclude
	private String formattedTotalAmountWithPaymentMethodRequired;
	@JsonExclude
	private String totalPaymentMethodAmount;
	@JsonExclude
	private String formattedTotalPaymentMethodAmount;
	@JsonExclude
	private String amountWithMissingPaymentMethod;
	@JsonExclude
	private String formattedAmountWithMissingPaymentMethod;
	@JsonExclude
	private String totalTaxableAmount;
	@JsonExclude
	private String formattedTotalTaxableAmount;
	@JsonExclude
	private String totalLineItemTaxableAmount;
	@JsonExclude
	private String formattedTotalLineItemTaxableAmount;
	@JsonExclude
	private String totalShippingMethodTaxableAmount;
	@JsonExclude
	private String formattedTotalShippingMethodTaxableAmount;
	@JsonExclude
	private String totalPaymentMethodTaxableAmount;
	@JsonExclude
	private String formattedTotalPaymentMethodTaxableAmount;
	@JsonExclude
	private String totalTaxAmount;
	@JsonExclude
	private String formattedTotalTaxAmount;
	@JsonExclude
	private String totalLineItemTaxAmount;
	@JsonExclude
	private String formattedTotalLineItemTaxAmount;
	@JsonExclude
	private String totalShippingMethodTaxAmount;
	@JsonExclude
	private String formattedTotalShippingMethodTaxAmount;
	@JsonExclude
	private String totalPaymentMethodTaxAmount;
	@JsonExclude
	private String formattedTotalPaymentMethodTaxAmount;
	@JsonExclude
	private String defaultShippingMethodId;
	@JsonExclude
	private String availableShippingServiceIds;
	@JsonExclude
	private String availablePaymentTypeIds;
	@JsonExclude
	private String pendingTransactions;
	@JsonExclude
	private String placed;


	public Order() {
		super();
	}
	

	public Order(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	

	public Integer getCustomerId() {
		return this.customerId;
	}
	

	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}
	

	public Integer getMerchantId() {
		return this.merchantId;
	}
	

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}
	

	public Integer getChannelId() {
		return this.channelId;
	}
	

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	

	public Integer getCountryId() {
		return this.countryId;
	}
	

	public void setMarketId(Integer marketId) {
		this.marketId = marketId;
	}
	

	public Integer getMarketId() {
		return this.marketId;
	}
	

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}
	

	public Integer getCurrencyId() {
		return this.currencyId;
	}
	

	public void setToken(String token) {
		this.token = token;
	}
	

	public String getToken() {
		return this.token;
	}
	

	public void setTaxIncluded(Object taxIncluded) {
		this.taxIncluded = taxIncluded;
	}
	

	public Object getTaxIncluded() {
		return this.taxIncluded;
	}
	

	public void setTaxRate(Float taxRate) {
		this.taxRate = taxRate;
	}
	

	public Float getTaxRate() {
		return this.taxRate;
	}
	

	public void setHasNexus(Object hasNexus) {
		this.hasNexus = hasNexus;
	}
	

	public Object getHasNexus() {
		return this.hasNexus;
	}
	

	public void setShippingMethodTaxable(Object shippingMethodTaxable) {
		this.shippingMethodTaxable = shippingMethodTaxable;
	}
	

	public Object getShippingMethodTaxable() {
		return this.shippingMethodTaxable;
	}
	

	public void setPaymentMethodTaxable(Object paymentMethodTaxable) {
		this.paymentMethodTaxable = paymentMethodTaxable;
	}
	

	public Object getPaymentMethodTaxable() {
		return this.paymentMethodTaxable;
	}
	

	public void setTaxSource(String taxSource) {
		this.taxSource = taxSource;
	}
	

	public String getTaxSource() {
		return this.taxSource;
	}
	

	public void setPlacedAt(LocalDateTime placedAt) {
		this.placedAt = placedAt;
	}
	

	public LocalDateTime getPlacedAt() {
		return this.placedAt;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setCustomer(Object customer) {
		this.customer = customer;
	}
	

	public Object getCustomer() {
		return this.customer;
	}
	

	public void setChannel(Object channel) {
		this.channel = channel;
	}
	

	public Object getChannel() {
		return this.channel;
	}
	

	public void setCountry(Object country) {
		this.country = country;
	}
	

	public Object getCountry() {
		return this.country;
	}
	

	public void setMarket(Object market) {
		this.market = market;
	}
	

	public Object getMarket() {
		return this.market;
	}
	

	public void setMerchant(Object merchant) {
		this.merchant = merchant;
	}
	

	public Object getMerchant() {
		return this.merchant;
	}
	

	public void setCurrency(Object currency) {
		this.currency = currency;
	}
	

	public Object getCurrency() {
		return this.currency;
	}
	

	public void setLineItems(List<String> lineItems) {
		this.lineItems = lineItems;
	}
	

	public List<String> getLineItems() {
		return this.lineItems;
	}
	

	public void setLineItemStocks(List<String> lineItemStocks) {
		this.lineItemStocks = lineItemStocks;
	}
	

	public List<String> getLineItemStocks() {
		return this.lineItemStocks;
	}
	

	public void setPaymentMethods(List<String> paymentMethods) {
		this.paymentMethods = paymentMethods;
	}
	

	public List<String> getPaymentMethods() {
		return this.paymentMethods;
	}
	

	public void setShippingMethods(List<String> shippingMethods) {
		this.shippingMethods = shippingMethods;
	}
	

	public List<String> getShippingMethods() {
		return this.shippingMethods;
	}
	

	public void setShipments(List<String> shipments) {
		this.shipments = shipments;
	}
	

	public List<String> getShipments() {
		return this.shipments;
	}
	

	public void setTransactions(List<String> transactions) {
		this.transactions = transactions;
	}
	

	public List<String> getTransactions() {
		return this.transactions;
	}
	

	public void setMarketPaymentTypes(List<String> marketPaymentTypes) {
		this.marketPaymentTypes = marketPaymentTypes;
	}
	

	public List<String> getMarketPaymentTypes() {
		return this.marketPaymentTypes;
	}
	

	public void setPaymentTypes(List<String> paymentTypes) {
		this.paymentTypes = paymentTypes;
	}
	

	public List<String> getPaymentTypes() {
		return this.paymentTypes;
	}
	

	public void setMarketShippingServices(List<String> marketShippingServices) {
		this.marketShippingServices = marketShippingServices;
	}
	

	public List<String> getMarketShippingServices() {
		return this.marketShippingServices;
	}
	

	public void setShippingServices(List<String> shippingServices) {
		this.shippingServices = shippingServices;
	}
	

	public List<String> getShippingServices() {
		return this.shippingServices;
	}
	

	public void setTotalAmountWithTax(String totalAmountWithTax) {
		this.totalAmountWithTax = totalAmountWithTax;
	}
	

	public String getTotalAmountWithTax() {
		return this.totalAmountWithTax;
	}
	

	public void setFormattedTotalAmountWithTax(String formattedTotalAmountWithTax) {
		this.formattedTotalAmountWithTax = formattedTotalAmountWithTax;
	}
	

	public String getFormattedTotalAmountWithTax() {
		return this.formattedTotalAmountWithTax;
	}
	

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	

	public String getTotalAmount() {
		return this.totalAmount;
	}
	

	public void setFormattedTotalAmount(String formattedTotalAmount) {
		this.formattedTotalAmount = formattedTotalAmount;
	}
	

	public String getFormattedTotalAmount() {
		return this.formattedTotalAmount;
	}
	

	public void setTotalLineItemAmount(String totalLineItemAmount) {
		this.totalLineItemAmount = totalLineItemAmount;
	}
	

	public String getTotalLineItemAmount() {
		return this.totalLineItemAmount;
	}
	

	public void setFormattedTotalLineItemAmount(String formattedTotalLineItemAmount) {
		this.formattedTotalLineItemAmount = formattedTotalLineItemAmount;
	}
	

	public String getFormattedTotalLineItemAmount() {
		return this.formattedTotalLineItemAmount;
	}
	

	public void setTotalShippingMethodAmount(String totalShippingMethodAmount) {
		this.totalShippingMethodAmount = totalShippingMethodAmount;
	}
	

	public String getTotalShippingMethodAmount() {
		return this.totalShippingMethodAmount;
	}
	

	public void setFormattedTotalShippingMethodAmount(String formattedTotalShippingMethodAmount) {
		this.formattedTotalShippingMethodAmount = formattedTotalShippingMethodAmount;
	}
	

	public String getFormattedTotalShippingMethodAmount() {
		return this.formattedTotalShippingMethodAmount;
	}
	

	public void setTotalPaymentMethodPrice(String totalPaymentMethodPrice) {
		this.totalPaymentMethodPrice = totalPaymentMethodPrice;
	}
	

	public String getTotalPaymentMethodPrice() {
		return this.totalPaymentMethodPrice;
	}
	

	public void setFormattedTotalPaymentMethodPrice(String formattedTotalPaymentMethodPrice) {
		this.formattedTotalPaymentMethodPrice = formattedTotalPaymentMethodPrice;
	}
	

	public String getFormattedTotalPaymentMethodPrice() {
		return this.formattedTotalPaymentMethodPrice;
	}
	

	public void setTotalAmountWithPaymentMethodRequired(String totalAmountWithPaymentMethodRequired) {
		this.totalAmountWithPaymentMethodRequired = totalAmountWithPaymentMethodRequired;
	}
	

	public String getTotalAmountWithPaymentMethodRequired() {
		return this.totalAmountWithPaymentMethodRequired;
	}
	

	public void setFormattedTotalAmountWithPaymentMethodRequired(String formattedTotalAmountWithPaymentMethodRequired) {
		this.formattedTotalAmountWithPaymentMethodRequired = formattedTotalAmountWithPaymentMethodRequired;
	}
	

	public String getFormattedTotalAmountWithPaymentMethodRequired() {
		return this.formattedTotalAmountWithPaymentMethodRequired;
	}
	

	public void setTotalPaymentMethodAmount(String totalPaymentMethodAmount) {
		this.totalPaymentMethodAmount = totalPaymentMethodAmount;
	}
	

	public String getTotalPaymentMethodAmount() {
		return this.totalPaymentMethodAmount;
	}
	

	public void setFormattedTotalPaymentMethodAmount(String formattedTotalPaymentMethodAmount) {
		this.formattedTotalPaymentMethodAmount = formattedTotalPaymentMethodAmount;
	}
	

	public String getFormattedTotalPaymentMethodAmount() {
		return this.formattedTotalPaymentMethodAmount;
	}
	

	public void setAmountWithMissingPaymentMethod(String amountWithMissingPaymentMethod) {
		this.amountWithMissingPaymentMethod = amountWithMissingPaymentMethod;
	}
	

	public String getAmountWithMissingPaymentMethod() {
		return this.amountWithMissingPaymentMethod;
	}
	

	public void setFormattedAmountWithMissingPaymentMethod(String formattedAmountWithMissingPaymentMethod) {
		this.formattedAmountWithMissingPaymentMethod = formattedAmountWithMissingPaymentMethod;
	}
	

	public String getFormattedAmountWithMissingPaymentMethod() {
		return this.formattedAmountWithMissingPaymentMethod;
	}
	

	public void setTotalTaxableAmount(String totalTaxableAmount) {
		this.totalTaxableAmount = totalTaxableAmount;
	}
	

	public String getTotalTaxableAmount() {
		return this.totalTaxableAmount;
	}
	

	public void setFormattedTotalTaxableAmount(String formattedTotalTaxableAmount) {
		this.formattedTotalTaxableAmount = formattedTotalTaxableAmount;
	}
	

	public String getFormattedTotalTaxableAmount() {
		return this.formattedTotalTaxableAmount;
	}
	

	public void setTotalLineItemTaxableAmount(String totalLineItemTaxableAmount) {
		this.totalLineItemTaxableAmount = totalLineItemTaxableAmount;
	}
	

	public String getTotalLineItemTaxableAmount() {
		return this.totalLineItemTaxableAmount;
	}
	

	public void setFormattedTotalLineItemTaxableAmount(String formattedTotalLineItemTaxableAmount) {
		this.formattedTotalLineItemTaxableAmount = formattedTotalLineItemTaxableAmount;
	}
	

	public String getFormattedTotalLineItemTaxableAmount() {
		return this.formattedTotalLineItemTaxableAmount;
	}
	

	public void setTotalShippingMethodTaxableAmount(String totalShippingMethodTaxableAmount) {
		this.totalShippingMethodTaxableAmount = totalShippingMethodTaxableAmount;
	}
	

	public String getTotalShippingMethodTaxableAmount() {
		return this.totalShippingMethodTaxableAmount;
	}
	

	public void setFormattedTotalShippingMethodTaxableAmount(String formattedTotalShippingMethodTaxableAmount) {
		this.formattedTotalShippingMethodTaxableAmount = formattedTotalShippingMethodTaxableAmount;
	}
	

	public String getFormattedTotalShippingMethodTaxableAmount() {
		return this.formattedTotalShippingMethodTaxableAmount;
	}
	

	public void setTotalPaymentMethodTaxableAmount(String totalPaymentMethodTaxableAmount) {
		this.totalPaymentMethodTaxableAmount = totalPaymentMethodTaxableAmount;
	}
	

	public String getTotalPaymentMethodTaxableAmount() {
		return this.totalPaymentMethodTaxableAmount;
	}
	

	public void setFormattedTotalPaymentMethodTaxableAmount(String formattedTotalPaymentMethodTaxableAmount) {
		this.formattedTotalPaymentMethodTaxableAmount = formattedTotalPaymentMethodTaxableAmount;
	}
	

	public String getFormattedTotalPaymentMethodTaxableAmount() {
		return this.formattedTotalPaymentMethodTaxableAmount;
	}
	

	public void setTotalTaxAmount(String totalTaxAmount) {
		this.totalTaxAmount = totalTaxAmount;
	}
	

	public String getTotalTaxAmount() {
		return this.totalTaxAmount;
	}
	

	public void setFormattedTotalTaxAmount(String formattedTotalTaxAmount) {
		this.formattedTotalTaxAmount = formattedTotalTaxAmount;
	}
	

	public String getFormattedTotalTaxAmount() {
		return this.formattedTotalTaxAmount;
	}
	

	public void setTotalLineItemTaxAmount(String totalLineItemTaxAmount) {
		this.totalLineItemTaxAmount = totalLineItemTaxAmount;
	}
	

	public String getTotalLineItemTaxAmount() {
		return this.totalLineItemTaxAmount;
	}
	

	public void setFormattedTotalLineItemTaxAmount(String formattedTotalLineItemTaxAmount) {
		this.formattedTotalLineItemTaxAmount = formattedTotalLineItemTaxAmount;
	}
	

	public String getFormattedTotalLineItemTaxAmount() {
		return this.formattedTotalLineItemTaxAmount;
	}
	

	public void setTotalShippingMethodTaxAmount(String totalShippingMethodTaxAmount) {
		this.totalShippingMethodTaxAmount = totalShippingMethodTaxAmount;
	}
	

	public String getTotalShippingMethodTaxAmount() {
		return this.totalShippingMethodTaxAmount;
	}
	

	public void setFormattedTotalShippingMethodTaxAmount(String formattedTotalShippingMethodTaxAmount) {
		this.formattedTotalShippingMethodTaxAmount = formattedTotalShippingMethodTaxAmount;
	}
	

	public String getFormattedTotalShippingMethodTaxAmount() {
		return this.formattedTotalShippingMethodTaxAmount;
	}
	

	public void setTotalPaymentMethodTaxAmount(String totalPaymentMethodTaxAmount) {
		this.totalPaymentMethodTaxAmount = totalPaymentMethodTaxAmount;
	}
	

	public String getTotalPaymentMethodTaxAmount() {
		return this.totalPaymentMethodTaxAmount;
	}
	

	public void setFormattedTotalPaymentMethodTaxAmount(String formattedTotalPaymentMethodTaxAmount) {
		this.formattedTotalPaymentMethodTaxAmount = formattedTotalPaymentMethodTaxAmount;
	}
	

	public String getFormattedTotalPaymentMethodTaxAmount() {
		return this.formattedTotalPaymentMethodTaxAmount;
	}
	

	public void setDefaultShippingMethodId(String defaultShippingMethodId) {
		this.defaultShippingMethodId = defaultShippingMethodId;
	}
	

	public String getDefaultShippingMethodId() {
		return this.defaultShippingMethodId;
	}
	

	public void setAvailableShippingServiceIds(String availableShippingServiceIds) {
		this.availableShippingServiceIds = availableShippingServiceIds;
	}
	

	public String getAvailableShippingServiceIds() {
		return this.availableShippingServiceIds;
	}
	

	public void setAvailablePaymentTypeIds(String availablePaymentTypeIds) {
		this.availablePaymentTypeIds = availablePaymentTypeIds;
	}
	

	public String getAvailablePaymentTypeIds() {
		return this.availablePaymentTypeIds;
	}
	

	public void setPendingTransactions(String pendingTransactions) {
		this.pendingTransactions = pendingTransactions;
	}
	

	public String getPendingTransactions() {
		return this.pendingTransactions;
	}
	

	public void setPlaced(String placed) {
		this.placed = placed;
	}
	

	public String getPlaced() {
		return this.placed;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Order x = (Order)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.customerId, x.customerId)
			&& Objects.equals(this.merchantId, x.merchantId)
			&& Objects.equals(this.channelId, x.channelId)
			&& Objects.equals(this.countryId, x.countryId)
			&& Objects.equals(this.marketId, x.marketId)
			&& Objects.equals(this.currencyId, x.currencyId)
			&& Objects.equals(this.token, x.token)
			&& Objects.equals(this.taxIncluded, x.taxIncluded)
			&& Objects.equals(this.taxRate, x.taxRate)
			&& Objects.equals(this.hasNexus, x.hasNexus)
			&& Objects.equals(this.shippingMethodTaxable, x.shippingMethodTaxable)
			&& Objects.equals(this.paymentMethodTaxable, x.paymentMethodTaxable)
			&& Objects.equals(this.taxSource, x.taxSource)
			&& Objects.equals(this.placedAt, x.placedAt)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.customer, x.customer)
			&& Objects.equals(this.channel, x.channel)
			&& Objects.equals(this.country, x.country)
			&& Objects.equals(this.market, x.market)
			&& Objects.equals(this.merchant, x.merchant)
			&& Objects.equals(this.currency, x.currency)
			&& Objects.equals(this.lineItems, x.lineItems)
			&& Objects.equals(this.lineItemStocks, x.lineItemStocks)
			&& Objects.equals(this.paymentMethods, x.paymentMethods)
			&& Objects.equals(this.shippingMethods, x.shippingMethods)
			&& Objects.equals(this.shipments, x.shipments)
			&& Objects.equals(this.transactions, x.transactions)
			&& Objects.equals(this.marketPaymentTypes, x.marketPaymentTypes)
			&& Objects.equals(this.paymentTypes, x.paymentTypes)
			&& Objects.equals(this.marketShippingServices, x.marketShippingServices)
			&& Objects.equals(this.shippingServices, x.shippingServices)
			&& Objects.equals(this.totalAmountWithTax, x.totalAmountWithTax)
			&& Objects.equals(this.formattedTotalAmountWithTax, x.formattedTotalAmountWithTax)
			&& Objects.equals(this.totalAmount, x.totalAmount)
			&& Objects.equals(this.formattedTotalAmount, x.formattedTotalAmount)
			&& Objects.equals(this.totalLineItemAmount, x.totalLineItemAmount)
			&& Objects.equals(this.formattedTotalLineItemAmount, x.formattedTotalLineItemAmount)
			&& Objects.equals(this.totalShippingMethodAmount, x.totalShippingMethodAmount)
			&& Objects.equals(this.formattedTotalShippingMethodAmount, x.formattedTotalShippingMethodAmount)
			&& Objects.equals(this.totalPaymentMethodPrice, x.totalPaymentMethodPrice)
			&& Objects.equals(this.formattedTotalPaymentMethodPrice, x.formattedTotalPaymentMethodPrice)
			&& Objects.equals(this.totalAmountWithPaymentMethodRequired, x.totalAmountWithPaymentMethodRequired)
			&& Objects.equals(this.formattedTotalAmountWithPaymentMethodRequired, x.formattedTotalAmountWithPaymentMethodRequired)
			&& Objects.equals(this.totalPaymentMethodAmount, x.totalPaymentMethodAmount)
			&& Objects.equals(this.formattedTotalPaymentMethodAmount, x.formattedTotalPaymentMethodAmount)
			&& Objects.equals(this.amountWithMissingPaymentMethod, x.amountWithMissingPaymentMethod)
			&& Objects.equals(this.formattedAmountWithMissingPaymentMethod, x.formattedAmountWithMissingPaymentMethod)
			&& Objects.equals(this.totalTaxableAmount, x.totalTaxableAmount)
			&& Objects.equals(this.formattedTotalTaxableAmount, x.formattedTotalTaxableAmount)
			&& Objects.equals(this.totalLineItemTaxableAmount, x.totalLineItemTaxableAmount)
			&& Objects.equals(this.formattedTotalLineItemTaxableAmount, x.formattedTotalLineItemTaxableAmount)
			&& Objects.equals(this.totalShippingMethodTaxableAmount, x.totalShippingMethodTaxableAmount)
			&& Objects.equals(this.formattedTotalShippingMethodTaxableAmount, x.formattedTotalShippingMethodTaxableAmount)
			&& Objects.equals(this.totalPaymentMethodTaxableAmount, x.totalPaymentMethodTaxableAmount)
			&& Objects.equals(this.formattedTotalPaymentMethodTaxableAmount, x.formattedTotalPaymentMethodTaxableAmount)
			&& Objects.equals(this.totalTaxAmount, x.totalTaxAmount)
			&& Objects.equals(this.formattedTotalTaxAmount, x.formattedTotalTaxAmount)
			&& Objects.equals(this.totalLineItemTaxAmount, x.totalLineItemTaxAmount)
			&& Objects.equals(this.formattedTotalLineItemTaxAmount, x.formattedTotalLineItemTaxAmount)
			&& Objects.equals(this.totalShippingMethodTaxAmount, x.totalShippingMethodTaxAmount)
			&& Objects.equals(this.formattedTotalShippingMethodTaxAmount, x.formattedTotalShippingMethodTaxAmount)
			&& Objects.equals(this.totalPaymentMethodTaxAmount, x.totalPaymentMethodTaxAmount)
			&& Objects.equals(this.formattedTotalPaymentMethodTaxAmount, x.formattedTotalPaymentMethodTaxAmount)
			&& Objects.equals(this.defaultShippingMethodId, x.defaultShippingMethodId)
			&& Objects.equals(this.availableShippingServiceIds, x.availableShippingServiceIds)
			&& Objects.equals(this.availablePaymentTypeIds, x.availablePaymentTypeIds)
			&& Objects.equals(this.pendingTransactions, x.pendingTransactions)
			&& Objects.equals(this.placed, x.placed)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, customerId, merchantId, channelId, countryId,
			marketId, currencyId, token, taxIncluded, taxRate,
			hasNexus, shippingMethodTaxable, paymentMethodTaxable, taxSource, placedAt,
			previousChanges, customer, channel, country, market,
			merchant, currency, lineItems, lineItemStocks, paymentMethods,
			shippingMethods, shipments, transactions, marketPaymentTypes, paymentTypes,
			marketShippingServices, shippingServices, totalAmountWithTax, formattedTotalAmountWithTax, totalAmount,
			formattedTotalAmount, totalLineItemAmount, formattedTotalLineItemAmount, totalShippingMethodAmount, formattedTotalShippingMethodAmount,
			totalPaymentMethodPrice, formattedTotalPaymentMethodPrice, totalAmountWithPaymentMethodRequired, formattedTotalAmountWithPaymentMethodRequired, totalPaymentMethodAmount,
			formattedTotalPaymentMethodAmount, amountWithMissingPaymentMethod, formattedAmountWithMissingPaymentMethod, totalTaxableAmount, formattedTotalTaxableAmount,
			totalLineItemTaxableAmount, formattedTotalLineItemTaxableAmount, totalShippingMethodTaxableAmount, formattedTotalShippingMethodTaxableAmount, totalPaymentMethodTaxableAmount,
			formattedTotalPaymentMethodTaxableAmount, totalTaxAmount, formattedTotalTaxAmount, totalLineItemTaxAmount, formattedTotalLineItemTaxAmount,
			totalShippingMethodTaxAmount, formattedTotalShippingMethodTaxAmount, totalPaymentMethodTaxAmount, formattedTotalPaymentMethodTaxAmount, defaultShippingMethodId,
			availableShippingServiceIds, availablePaymentTypeIds, pendingTransactions, placed 
		);
	
	}
	

	@Override
	public Order clone() {
	
		Order no = new Order();
	
		no.name = this.name;
		no.customerId = this.customerId;
		no.merchantId = this.merchantId;
		no.channelId = this.channelId;
		no.countryId = this.countryId;
		no.marketId = this.marketId;
		no.currencyId = this.currencyId;
		no.token = this.token;
		no.taxIncluded = this.taxIncluded;
		no.taxRate = this.taxRate;
		no.hasNexus = this.hasNexus;
		no.shippingMethodTaxable = this.shippingMethodTaxable;
		no.paymentMethodTaxable = this.paymentMethodTaxable;
		no.taxSource = this.taxSource;
		no.placedAt = this.placedAt;
		no.previousChanges = this.previousChanges;
		no.customer = this.customer;
		no.channel = this.channel;
		no.country = this.country;
		no.market = this.market;
		no.merchant = this.merchant;
		no.currency = this.currency;
		no.lineItems = this.lineItems;
		no.lineItemStocks = this.lineItemStocks;
		no.paymentMethods = this.paymentMethods;
		no.shippingMethods = this.shippingMethods;
		no.shipments = this.shipments;
		no.transactions = this.transactions;
		no.marketPaymentTypes = this.marketPaymentTypes;
		no.paymentTypes = this.paymentTypes;
		no.marketShippingServices = this.marketShippingServices;
		no.shippingServices = this.shippingServices;
		no.totalAmountWithTax = this.totalAmountWithTax;
		no.formattedTotalAmountWithTax = this.formattedTotalAmountWithTax;
		no.totalAmount = this.totalAmount;
		no.formattedTotalAmount = this.formattedTotalAmount;
		no.totalLineItemAmount = this.totalLineItemAmount;
		no.formattedTotalLineItemAmount = this.formattedTotalLineItemAmount;
		no.totalShippingMethodAmount = this.totalShippingMethodAmount;
		no.formattedTotalShippingMethodAmount = this.formattedTotalShippingMethodAmount;
		no.totalPaymentMethodPrice = this.totalPaymentMethodPrice;
		no.formattedTotalPaymentMethodPrice = this.formattedTotalPaymentMethodPrice;
		no.totalAmountWithPaymentMethodRequired = this.totalAmountWithPaymentMethodRequired;
		no.formattedTotalAmountWithPaymentMethodRequired = this.formattedTotalAmountWithPaymentMethodRequired;
		no.totalPaymentMethodAmount = this.totalPaymentMethodAmount;
		no.formattedTotalPaymentMethodAmount = this.formattedTotalPaymentMethodAmount;
		no.amountWithMissingPaymentMethod = this.amountWithMissingPaymentMethod;
		no.formattedAmountWithMissingPaymentMethod = this.formattedAmountWithMissingPaymentMethod;
		no.totalTaxableAmount = this.totalTaxableAmount;
		no.formattedTotalTaxableAmount = this.formattedTotalTaxableAmount;
		no.totalLineItemTaxableAmount = this.totalLineItemTaxableAmount;
		no.formattedTotalLineItemTaxableAmount = this.formattedTotalLineItemTaxableAmount;
		no.totalShippingMethodTaxableAmount = this.totalShippingMethodTaxableAmount;
		no.formattedTotalShippingMethodTaxableAmount = this.formattedTotalShippingMethodTaxableAmount;
		no.totalPaymentMethodTaxableAmount = this.totalPaymentMethodTaxableAmount;
		no.formattedTotalPaymentMethodTaxableAmount = this.formattedTotalPaymentMethodTaxableAmount;
		no.totalTaxAmount = this.totalTaxAmount;
		no.formattedTotalTaxAmount = this.formattedTotalTaxAmount;
		no.totalLineItemTaxAmount = this.totalLineItemTaxAmount;
		no.formattedTotalLineItemTaxAmount = this.formattedTotalLineItemTaxAmount;
		no.totalShippingMethodTaxAmount = this.totalShippingMethodTaxAmount;
		no.formattedTotalShippingMethodTaxAmount = this.formattedTotalShippingMethodTaxAmount;
		no.totalPaymentMethodTaxAmount = this.totalPaymentMethodTaxAmount;
		no.formattedTotalPaymentMethodTaxAmount = this.formattedTotalPaymentMethodTaxAmount;
		no.defaultShippingMethodId = this.defaultShippingMethodId;
		no.availableShippingServiceIds = this.availableShippingServiceIds;
		no.availablePaymentTypeIds = this.availablePaymentTypeIds;
		no.pendingTransactions = this.pendingTransactions;
		no.placed = this.placed;
	
		return no;
	
	}
	
}
