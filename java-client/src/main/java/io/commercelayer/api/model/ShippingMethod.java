package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * ShippingMethod
 */
public class ShippingMethod extends ApiResource {

	private static final long serialVersionUID = -1L;


	private Integer orderId;
	private Integer shippingServiceId;
	@JsonExclude
	private String amount;
	@JsonExclude
	private String easypostAddressId;
	@JsonExclude
	private String easypostParcelId;
	@JsonExclude
	private String formattedAmount;
	@JsonExclude
	private String formattedFreeOverAmount;
	@JsonExclude
	private String formattedPrice;
	@JsonExclude
	private String formattedTaxAmount;
	@JsonExclude
	private String formattedTaxableAmount;
	@JsonExclude
	private String formattedTotalLineItemAmount;
	@JsonExclude
	private String freeOverAmount;
	@JsonExclude
	private Integer freeOverAmountCents;
	@JsonExclude
	private List<String> lineItemStocks;
	@JsonExclude
	private List<String> lineItems;
	@JsonExclude
	private String name;
	@JsonExclude
	private Object order;
	@JsonExclude
	private String price;
	@JsonExclude
	private Integer priceCents;
	@JsonExclude
	private List<String> shipments;
	@JsonExclude
	private Object shippingAddress;
	@JsonExclude
	private Integer shippingAddressId;
	@JsonExclude
	private Object shippingPackage;
	@JsonExclude
	private Integer shippingPackageId;
	@JsonExclude
	private Object shippingRecipient;
	@JsonExclude
	private Integer shippingRecipientId;
	@JsonExclude
	private Object shippingService;
	@JsonExclude
	private String state;
	@JsonExclude
	private String taxAmount;
	@JsonExclude
	private Float taxRate;
	@JsonExclude
	private String taxableAmount;
	@JsonExclude
	private String totalLineItemAmount;
	@JsonExclude
	private List<String> versions;


	public ShippingMethod() {
		super();
	}
	

	public ShippingMethod(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public ShippingMethod name(String name) {
		setName(name);
		return this;
	}
	

	public String name() {
		return getName();
	}
	

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	

	public Integer getOrderId() {
		return this.orderId;
	}
	

	public ShippingMethod orderId(Integer orderId) {
		setOrderId(orderId);
		return this;
	}
	

	public Integer orderId() {
		return getOrderId();
	}
	

	public void setShippingServiceId(Integer shippingServiceId) {
		this.shippingServiceId = shippingServiceId;
	}
	

	public Integer getShippingServiceId() {
		return this.shippingServiceId;
	}
	

	public ShippingMethod shippingServiceId(Integer shippingServiceId) {
		setShippingServiceId(shippingServiceId);
		return this;
	}
	

	public Integer shippingServiceId() {
		return getShippingServiceId();
	}
	

	public void setShippingRecipientId(Integer shippingRecipientId) {
		this.shippingRecipientId = shippingRecipientId;
	}
	

	public Integer getShippingRecipientId() {
		return this.shippingRecipientId;
	}
	

	public ShippingMethod shippingRecipientId(Integer shippingRecipientId) {
		setShippingRecipientId(shippingRecipientId);
		return this;
	}
	

	public Integer shippingRecipientId() {
		return getShippingRecipientId();
	}
	

	public void setShippingAddressId(Integer shippingAddressId) {
		this.shippingAddressId = shippingAddressId;
	}
	

	public Integer getShippingAddressId() {
		return this.shippingAddressId;
	}
	

	public ShippingMethod shippingAddressId(Integer shippingAddressId) {
		setShippingAddressId(shippingAddressId);
		return this;
	}
	

	public Integer shippingAddressId() {
		return getShippingAddressId();
	}
	

	public void setShippingPackageId(Integer shippingPackageId) {
		this.shippingPackageId = shippingPackageId;
	}
	

	public Integer getShippingPackageId() {
		return this.shippingPackageId;
	}
	

	public ShippingMethod shippingPackageId(Integer shippingPackageId) {
		setShippingPackageId(shippingPackageId);
		return this;
	}
	

	public Integer shippingPackageId() {
		return getShippingPackageId();
	}
	

	public void setPriceCents(Integer priceCents) {
		this.priceCents = priceCents;
	}
	

	public Integer getPriceCents() {
		return this.priceCents;
	}
	

	public ShippingMethod priceCents(Integer priceCents) {
		setPriceCents(priceCents);
		return this;
	}
	

	public Integer priceCents() {
		return getPriceCents();
	}
	

	public void setFreeOverAmountCents(Integer freeOverAmountCents) {
		this.freeOverAmountCents = freeOverAmountCents;
	}
	

	public Integer getFreeOverAmountCents() {
		return this.freeOverAmountCents;
	}
	

	public ShippingMethod freeOverAmountCents(Integer freeOverAmountCents) {
		setFreeOverAmountCents(freeOverAmountCents);
		return this;
	}
	

	public Integer freeOverAmountCents() {
		return getFreeOverAmountCents();
	}
	

	public void setTaxRate(Float taxRate) {
		this.taxRate = taxRate;
	}
	

	public Float getTaxRate() {
		return this.taxRate;
	}
	

	public ShippingMethod taxRate(Float taxRate) {
		setTaxRate(taxRate);
		return this;
	}
	

	public Float taxRate() {
		return getTaxRate();
	}
	

	public void setEasypostAddressId(String easypostAddressId) {
		this.easypostAddressId = easypostAddressId;
	}
	

	public String getEasypostAddressId() {
		return this.easypostAddressId;
	}
	

	public ShippingMethod easypostAddressId(String easypostAddressId) {
		setEasypostAddressId(easypostAddressId);
		return this;
	}
	

	public String easypostAddressId() {
		return getEasypostAddressId();
	}
	

	public void setEasypostParcelId(String easypostParcelId) {
		this.easypostParcelId = easypostParcelId;
	}
	

	public String getEasypostParcelId() {
		return this.easypostParcelId;
	}
	

	public ShippingMethod easypostParcelId(String easypostParcelId) {
		setEasypostParcelId(easypostParcelId);
		return this;
	}
	

	public String easypostParcelId() {
		return getEasypostParcelId();
	}
	

	public void setState(String state) {
		this.state = state;
	}
	

	public String getState() {
		return this.state;
	}
	

	public ShippingMethod state(String state) {
		setState(state);
		return this;
	}
	

	public String state() {
		return getState();
	}
	

	public void setOrder(Object order) {
		this.order = order;
	}
	

	public Object getOrder() {
		return this.order;
	}
	

	public ShippingMethod order(Object order) {
		setOrder(order);
		return this;
	}
	

	public Object order() {
		return getOrder();
	}
	

	public void setShippingRecipient(Object shippingRecipient) {
		this.shippingRecipient = shippingRecipient;
	}
	

	public Object getShippingRecipient() {
		return this.shippingRecipient;
	}
	

	public ShippingMethod shippingRecipient(Object shippingRecipient) {
		setShippingRecipient(shippingRecipient);
		return this;
	}
	

	public Object shippingRecipient() {
		return getShippingRecipient();
	}
	

	public void setShippingAddress(Object shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	

	public Object getShippingAddress() {
		return this.shippingAddress;
	}
	

	public ShippingMethod shippingAddress(Object shippingAddress) {
		setShippingAddress(shippingAddress);
		return this;
	}
	

	public Object shippingAddress() {
		return getShippingAddress();
	}
	

	public void setShippingService(Object shippingService) {
		this.shippingService = shippingService;
	}
	

	public Object getShippingService() {
		return this.shippingService;
	}
	

	public ShippingMethod shippingService(Object shippingService) {
		setShippingService(shippingService);
		return this;
	}
	

	public Object shippingService() {
		return getShippingService();
	}
	

	public void setShippingPackage(Object shippingPackage) {
		this.shippingPackage = shippingPackage;
	}
	

	public Object getShippingPackage() {
		return this.shippingPackage;
	}
	

	public ShippingMethod shippingPackage(Object shippingPackage) {
		setShippingPackage(shippingPackage);
		return this;
	}
	

	public Object shippingPackage() {
		return getShippingPackage();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public ShippingMethod versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	public void setShipments(List<String> shipments) {
		this.shipments = shipments;
	}
	

	public List<String> getShipments() {
		return this.shipments;
	}
	

	public ShippingMethod shipments(List<String> shipments) {
		setShipments(shipments);
		return this;
	}
	

	public List<String> shipments() {
		return getShipments();
	}
	

	public void setLineItemStocks(List<String> lineItemStocks) {
		this.lineItemStocks = lineItemStocks;
	}
	

	public List<String> getLineItemStocks() {
		return this.lineItemStocks;
	}
	

	public ShippingMethod lineItemStocks(List<String> lineItemStocks) {
		setLineItemStocks(lineItemStocks);
		return this;
	}
	

	public List<String> lineItemStocks() {
		return getLineItemStocks();
	}
	

	public void setLineItems(List<String> lineItems) {
		this.lineItems = lineItems;
	}
	

	public List<String> getLineItems() {
		return this.lineItems;
	}
	

	public ShippingMethod lineItems(List<String> lineItems) {
		setLineItems(lineItems);
		return this;
	}
	

	public List<String> lineItems() {
		return getLineItems();
	}
	

	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}
	

	public String getTaxAmount() {
		return this.taxAmount;
	}
	

	public ShippingMethod taxAmount(String taxAmount) {
		setTaxAmount(taxAmount);
		return this;
	}
	

	public String taxAmount() {
		return getTaxAmount();
	}
	

	public void setFormattedTaxAmount(String formattedTaxAmount) {
		this.formattedTaxAmount = formattedTaxAmount;
	}
	

	public String getFormattedTaxAmount() {
		return this.formattedTaxAmount;
	}
	

	public ShippingMethod formattedTaxAmount(String formattedTaxAmount) {
		setFormattedTaxAmount(formattedTaxAmount);
		return this;
	}
	

	public String formattedTaxAmount() {
		return getFormattedTaxAmount();
	}
	

	public void setTaxableAmount(String taxableAmount) {
		this.taxableAmount = taxableAmount;
	}
	

	public String getTaxableAmount() {
		return this.taxableAmount;
	}
	

	public ShippingMethod taxableAmount(String taxableAmount) {
		setTaxableAmount(taxableAmount);
		return this;
	}
	

	public String taxableAmount() {
		return getTaxableAmount();
	}
	

	public void setFormattedTaxableAmount(String formattedTaxableAmount) {
		this.formattedTaxableAmount = formattedTaxableAmount;
	}
	

	public String getFormattedTaxableAmount() {
		return this.formattedTaxableAmount;
	}
	

	public ShippingMethod formattedTaxableAmount(String formattedTaxableAmount) {
		setFormattedTaxableAmount(formattedTaxableAmount);
		return this;
	}
	

	public String formattedTaxableAmount() {
		return getFormattedTaxableAmount();
	}
	

	public void setAmount(String amount) {
		this.amount = amount;
	}
	

	public String getAmount() {
		return this.amount;
	}
	

	public ShippingMethod amount(String amount) {
		setAmount(amount);
		return this;
	}
	

	public String amount() {
		return getAmount();
	}
	

	public void setFormattedAmount(String formattedAmount) {
		this.formattedAmount = formattedAmount;
	}
	

	public String getFormattedAmount() {
		return this.formattedAmount;
	}
	

	public ShippingMethod formattedAmount(String formattedAmount) {
		setFormattedAmount(formattedAmount);
		return this;
	}
	

	public String formattedAmount() {
		return getFormattedAmount();
	}
	

	public void setTotalLineItemAmount(String totalLineItemAmount) {
		this.totalLineItemAmount = totalLineItemAmount;
	}
	

	public String getTotalLineItemAmount() {
		return this.totalLineItemAmount;
	}
	

	public ShippingMethod totalLineItemAmount(String totalLineItemAmount) {
		setTotalLineItemAmount(totalLineItemAmount);
		return this;
	}
	

	public String totalLineItemAmount() {
		return getTotalLineItemAmount();
	}
	

	public void setFormattedTotalLineItemAmount(String formattedTotalLineItemAmount) {
		this.formattedTotalLineItemAmount = formattedTotalLineItemAmount;
	}
	

	public String getFormattedTotalLineItemAmount() {
		return this.formattedTotalLineItemAmount;
	}
	

	public ShippingMethod formattedTotalLineItemAmount(String formattedTotalLineItemAmount) {
		setFormattedTotalLineItemAmount(formattedTotalLineItemAmount);
		return this;
	}
	

	public String formattedTotalLineItemAmount() {
		return getFormattedTotalLineItemAmount();
	}
	

	public void setPrice(String price) {
		this.price = price;
	}
	

	public String getPrice() {
		return this.price;
	}
	

	public ShippingMethod price(String price) {
		setPrice(price);
		return this;
	}
	

	public String price() {
		return getPrice();
	}
	

	public void setFormattedPrice(String formattedPrice) {
		this.formattedPrice = formattedPrice;
	}
	

	public String getFormattedPrice() {
		return this.formattedPrice;
	}
	

	public ShippingMethod formattedPrice(String formattedPrice) {
		setFormattedPrice(formattedPrice);
		return this;
	}
	

	public String formattedPrice() {
		return getFormattedPrice();
	}
	

	public void setFreeOverAmount(String freeOverAmount) {
		this.freeOverAmount = freeOverAmount;
	}
	

	public String getFreeOverAmount() {
		return this.freeOverAmount;
	}
	

	public ShippingMethod freeOverAmount(String freeOverAmount) {
		setFreeOverAmount(freeOverAmount);
		return this;
	}
	

	public String freeOverAmount() {
		return getFreeOverAmount();
	}
	

	public void setFormattedFreeOverAmount(String formattedFreeOverAmount) {
		this.formattedFreeOverAmount = formattedFreeOverAmount;
	}
	

	public String getFormattedFreeOverAmount() {
		return this.formattedFreeOverAmount;
	}
	

	public ShippingMethod formattedFreeOverAmount(String formattedFreeOverAmount) {
		setFormattedFreeOverAmount(formattedFreeOverAmount);
		return this;
	}
	

	public String formattedFreeOverAmount() {
		return getFormattedFreeOverAmount();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		ShippingMethod x = (ShippingMethod)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.orderId, x.orderId)
			&& Objects.equals(this.shippingServiceId, x.shippingServiceId)
			&& Objects.equals(this.shippingRecipientId, x.shippingRecipientId)
			&& Objects.equals(this.shippingAddressId, x.shippingAddressId)
			&& Objects.equals(this.shippingPackageId, x.shippingPackageId)
			&& Objects.equals(this.priceCents, x.priceCents)
			&& Objects.equals(this.freeOverAmountCents, x.freeOverAmountCents)
			&& Objects.equals(this.taxRate, x.taxRate)
			&& Objects.equals(this.easypostAddressId, x.easypostAddressId)
			&& Objects.equals(this.easypostParcelId, x.easypostParcelId)
			&& Objects.equals(this.state, x.state)
			&& Objects.equals(this.order, x.order)
			&& Objects.equals(this.shippingRecipient, x.shippingRecipient)
			&& Objects.equals(this.shippingAddress, x.shippingAddress)
			&& Objects.equals(this.shippingService, x.shippingService)
			&& Objects.equals(this.shippingPackage, x.shippingPackage)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.shipments, x.shipments)
			&& Objects.equals(this.lineItemStocks, x.lineItemStocks)
			&& Objects.equals(this.lineItems, x.lineItems)
			&& Objects.equals(this.taxAmount, x.taxAmount)
			&& Objects.equals(this.formattedTaxAmount, x.formattedTaxAmount)
			&& Objects.equals(this.taxableAmount, x.taxableAmount)
			&& Objects.equals(this.formattedTaxableAmount, x.formattedTaxableAmount)
			&& Objects.equals(this.amount, x.amount)
			&& Objects.equals(this.formattedAmount, x.formattedAmount)
			&& Objects.equals(this.totalLineItemAmount, x.totalLineItemAmount)
			&& Objects.equals(this.formattedTotalLineItemAmount, x.formattedTotalLineItemAmount)
			&& Objects.equals(this.price, x.price)
			&& Objects.equals(this.formattedPrice, x.formattedPrice)
			&& Objects.equals(this.freeOverAmount, x.freeOverAmount)
			&& Objects.equals(this.formattedFreeOverAmount, x.formattedFreeOverAmount)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, orderId, shippingServiceId, shippingRecipientId, shippingAddressId,
			shippingPackageId, priceCents, freeOverAmountCents, taxRate, easypostAddressId,
			easypostParcelId, state, order, shippingRecipient, shippingAddress,
			shippingService, shippingPackage, versions, shipments, lineItemStocks,
			lineItems, taxAmount, formattedTaxAmount, taxableAmount, formattedTaxableAmount,
			amount, formattedAmount, totalLineItemAmount, formattedTotalLineItemAmount, price,
			formattedPrice, freeOverAmount, formattedFreeOverAmount 
		);
	
	}
	

	@Override
	public ShippingMethod clone() {
	
		ShippingMethod no = new ShippingMethod();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.orderId = this.orderId;
		no.shippingServiceId = this.shippingServiceId;
		no.shippingRecipientId = this.shippingRecipientId;
		no.shippingAddressId = this.shippingAddressId;
		no.shippingPackageId = this.shippingPackageId;
		no.priceCents = this.priceCents;
		no.freeOverAmountCents = this.freeOverAmountCents;
		no.taxRate = this.taxRate;
		no.easypostAddressId = this.easypostAddressId;
		no.easypostParcelId = this.easypostParcelId;
		no.state = this.state;
		no.order = this.order;
		no.shippingRecipient = this.shippingRecipient;
		no.shippingAddress = this.shippingAddress;
		no.shippingService = this.shippingService;
		no.shippingPackage = this.shippingPackage;
		no.versions = this.versions;
		no.shipments = this.shipments;
		no.lineItemStocks = this.lineItemStocks;
		no.lineItems = this.lineItems;
		no.taxAmount = this.taxAmount;
		no.formattedTaxAmount = this.formattedTaxAmount;
		no.taxableAmount = this.taxableAmount;
		no.formattedTaxableAmount = this.formattedTaxableAmount;
		no.amount = this.amount;
		no.formattedAmount = this.formattedAmount;
		no.totalLineItemAmount = this.totalLineItemAmount;
		no.formattedTotalLineItemAmount = this.formattedTotalLineItemAmount;
		no.price = this.price;
		no.formattedPrice = this.formattedPrice;
		no.freeOverAmount = this.freeOverAmount;
		no.formattedFreeOverAmount = this.formattedFreeOverAmount;
	
		return no;
	
	}
	
}
