package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * PaymentMethod
 */
public class PaymentMethod extends ApiResource {

	private static final long serialVersionUID = -1L;


	private Integer billingAddressId;
	private Integer billingRecipientId;
	private Integer orderId;
	private Integer paymentSourceId;
	private String paymentSourceResource;
	@JsonExclude
	private String amount;
	@JsonExclude
	private Integer amountCents;
	@JsonExclude
	private String amountDue;
	@JsonExclude
	private Object billingAddress;
	@JsonExclude
	private Object billingRecipient;
	@JsonExclude
	private String creditCard;
	@JsonExclude
	private String formattedAmount;
	@JsonExclude
	private String formattedAmountDue;
	@JsonExclude
	private String formattedPaidAmount;
	@JsonExclude
	private String formattedPrice;
	@JsonExclude
	private String formattedRefundedAmount;
	@JsonExclude
	private String formattedTaxAmount;
	@JsonExclude
	private String formattedTaxableAmount;
	@JsonExclude
	private Object gateway;
	@JsonExclude
	private Integer gatewayId;
	@JsonExclude
	private List<String> invoices;
	@JsonExclude
	private String name;
	@JsonExclude
	private Object order;
	@JsonExclude
	private String paidAmount;
	@JsonExclude
	private Object paymentSource;
	@JsonExclude
	private Object paymentType;
	@JsonExclude
	private Integer paymentTypeId;
	@JsonExclude
	private String paypalAccount;
	@JsonExclude
	private String price;
	@JsonExclude
	private Integer priceCents;
	@JsonExclude
	private String redirectUrl;
	@JsonExclude
	private String refundedAmount;
	@JsonExclude
	private String taxAmount;
	@JsonExclude
	private String taxableAmount;
	@JsonExclude
	private List<String> transactions;
	@JsonExclude
	private List<String> versions;
	@JsonExclude
	private String wireTransfer;


	public PaymentMethod() {
		super();
	}
	

	public PaymentMethod(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public PaymentMethod name(String name) {
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
	

	public PaymentMethod orderId(Integer orderId) {
		setOrderId(orderId);
		return this;
	}
	

	public Integer orderId() {
		return getOrderId();
	}
	

	public void setPaymentTypeId(Integer paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}
	

	public Integer getPaymentTypeId() {
		return this.paymentTypeId;
	}
	

	public PaymentMethod paymentTypeId(Integer paymentTypeId) {
		setPaymentTypeId(paymentTypeId);
		return this;
	}
	

	public Integer paymentTypeId() {
		return getPaymentTypeId();
	}
	

	public void setPaymentSourceId(Integer paymentSourceId) {
		this.paymentSourceId = paymentSourceId;
	}
	

	public Integer getPaymentSourceId() {
		return this.paymentSourceId;
	}
	

	public PaymentMethod paymentSourceId(Integer paymentSourceId) {
		setPaymentSourceId(paymentSourceId);
		return this;
	}
	

	public Integer paymentSourceId() {
		return getPaymentSourceId();
	}
	

	public void setPaymentSourceResource(String paymentSourceResource) {
		this.paymentSourceResource = paymentSourceResource;
	}
	

	public String getPaymentSourceResource() {
		return this.paymentSourceResource;
	}
	

	public PaymentMethod paymentSourceResource(String paymentSourceResource) {
		setPaymentSourceResource(paymentSourceResource);
		return this;
	}
	

	public String paymentSourceResource() {
		return getPaymentSourceResource();
	}
	

	public void setGatewayId(Integer gatewayId) {
		this.gatewayId = gatewayId;
	}
	

	public Integer getGatewayId() {
		return this.gatewayId;
	}
	

	public PaymentMethod gatewayId(Integer gatewayId) {
		setGatewayId(gatewayId);
		return this;
	}
	

	public Integer gatewayId() {
		return getGatewayId();
	}
	

	public void setBillingRecipientId(Integer billingRecipientId) {
		this.billingRecipientId = billingRecipientId;
	}
	

	public Integer getBillingRecipientId() {
		return this.billingRecipientId;
	}
	

	public PaymentMethod billingRecipientId(Integer billingRecipientId) {
		setBillingRecipientId(billingRecipientId);
		return this;
	}
	

	public Integer billingRecipientId() {
		return getBillingRecipientId();
	}
	

	public void setBillingAddressId(Integer billingAddressId) {
		this.billingAddressId = billingAddressId;
	}
	

	public Integer getBillingAddressId() {
		return this.billingAddressId;
	}
	

	public PaymentMethod billingAddressId(Integer billingAddressId) {
		setBillingAddressId(billingAddressId);
		return this;
	}
	

	public Integer billingAddressId() {
		return getBillingAddressId();
	}
	

	public void setPriceCents(Integer priceCents) {
		this.priceCents = priceCents;
	}
	

	public Integer getPriceCents() {
		return this.priceCents;
	}
	

	public PaymentMethod priceCents(Integer priceCents) {
		setPriceCents(priceCents);
		return this;
	}
	

	public Integer priceCents() {
		return getPriceCents();
	}
	

	public void setAmountCents(Integer amountCents) {
		this.amountCents = amountCents;
	}
	

	public Integer getAmountCents() {
		return this.amountCents;
	}
	

	public PaymentMethod amountCents(Integer amountCents) {
		setAmountCents(amountCents);
		return this;
	}
	

	public Integer amountCents() {
		return getAmountCents();
	}
	

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	

	public PaymentMethod redirectUrl(String redirectUrl) {
		setRedirectUrl(redirectUrl);
		return this;
	}
	

	public String redirectUrl() {
		return getRedirectUrl();
	}
	

	public void setOrder(Object order) {
		this.order = order;
	}
	

	public Object getOrder() {
		return this.order;
	}
	

	public PaymentMethod order(Object order) {
		setOrder(order);
		return this;
	}
	

	public Object order() {
		return getOrder();
	}
	

	public void setPaymentType(Object paymentType) {
		this.paymentType = paymentType;
	}
	

	public Object getPaymentType() {
		return this.paymentType;
	}
	

	public PaymentMethod paymentType(Object paymentType) {
		setPaymentType(paymentType);
		return this;
	}
	

	public Object paymentType() {
		return getPaymentType();
	}
	

	public void setGateway(Object gateway) {
		this.gateway = gateway;
	}
	

	public Object getGateway() {
		return this.gateway;
	}
	

	public PaymentMethod gateway(Object gateway) {
		setGateway(gateway);
		return this;
	}
	

	public Object gateway() {
		return getGateway();
	}
	

	public void setBillingRecipient(Object billingRecipient) {
		this.billingRecipient = billingRecipient;
	}
	

	public Object getBillingRecipient() {
		return this.billingRecipient;
	}
	

	public PaymentMethod billingRecipient(Object billingRecipient) {
		setBillingRecipient(billingRecipient);
		return this;
	}
	

	public Object billingRecipient() {
		return getBillingRecipient();
	}
	

	public void setBillingAddress(Object billingAddress) {
		this.billingAddress = billingAddress;
	}
	

	public Object getBillingAddress() {
		return this.billingAddress;
	}
	

	public PaymentMethod billingAddress(Object billingAddress) {
		setBillingAddress(billingAddress);
		return this;
	}
	

	public Object billingAddress() {
		return getBillingAddress();
	}
	

	public void setPaymentSource(Object paymentSource) {
		this.paymentSource = paymentSource;
	}
	

	public Object getPaymentSource() {
		return this.paymentSource;
	}
	

	public PaymentMethod paymentSource(Object paymentSource) {
		setPaymentSource(paymentSource);
		return this;
	}
	

	public Object paymentSource() {
		return getPaymentSource();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public PaymentMethod versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	public void setTransactions(List<String> transactions) {
		this.transactions = transactions;
	}
	

	public List<String> getTransactions() {
		return this.transactions;
	}
	

	public PaymentMethod transactions(List<String> transactions) {
		setTransactions(transactions);
		return this;
	}
	

	public List<String> transactions() {
		return getTransactions();
	}
	

	public void setInvoices(List<String> invoices) {
		this.invoices = invoices;
	}
	

	public List<String> getInvoices() {
		return this.invoices;
	}
	

	public PaymentMethod invoices(List<String> invoices) {
		setInvoices(invoices);
		return this;
	}
	

	public List<String> invoices() {
		return getInvoices();
	}
	

	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}
	

	public String getTaxAmount() {
		return this.taxAmount;
	}
	

	public PaymentMethod taxAmount(String taxAmount) {
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
	

	public PaymentMethod formattedTaxAmount(String formattedTaxAmount) {
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
	

	public PaymentMethod taxableAmount(String taxableAmount) {
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
	

	public PaymentMethod formattedTaxableAmount(String formattedTaxableAmount) {
		setFormattedTaxableAmount(formattedTaxableAmount);
		return this;
	}
	

	public String formattedTaxableAmount() {
		return getFormattedTaxableAmount();
	}
	

	public void setPaidAmount(String paidAmount) {
		this.paidAmount = paidAmount;
	}
	

	public String getPaidAmount() {
		return this.paidAmount;
	}
	

	public PaymentMethod paidAmount(String paidAmount) {
		setPaidAmount(paidAmount);
		return this;
	}
	

	public String paidAmount() {
		return getPaidAmount();
	}
	

	public void setFormattedPaidAmount(String formattedPaidAmount) {
		this.formattedPaidAmount = formattedPaidAmount;
	}
	

	public String getFormattedPaidAmount() {
		return this.formattedPaidAmount;
	}
	

	public PaymentMethod formattedPaidAmount(String formattedPaidAmount) {
		setFormattedPaidAmount(formattedPaidAmount);
		return this;
	}
	

	public String formattedPaidAmount() {
		return getFormattedPaidAmount();
	}
	

	public void setRefundedAmount(String refundedAmount) {
		this.refundedAmount = refundedAmount;
	}
	

	public String getRefundedAmount() {
		return this.refundedAmount;
	}
	

	public PaymentMethod refundedAmount(String refundedAmount) {
		setRefundedAmount(refundedAmount);
		return this;
	}
	

	public String refundedAmount() {
		return getRefundedAmount();
	}
	

	public void setFormattedRefundedAmount(String formattedRefundedAmount) {
		this.formattedRefundedAmount = formattedRefundedAmount;
	}
	

	public String getFormattedRefundedAmount() {
		return this.formattedRefundedAmount;
	}
	

	public PaymentMethod formattedRefundedAmount(String formattedRefundedAmount) {
		setFormattedRefundedAmount(formattedRefundedAmount);
		return this;
	}
	

	public String formattedRefundedAmount() {
		return getFormattedRefundedAmount();
	}
	

	public void setAmountDue(String amountDue) {
		this.amountDue = amountDue;
	}
	

	public String getAmountDue() {
		return this.amountDue;
	}
	

	public PaymentMethod amountDue(String amountDue) {
		setAmountDue(amountDue);
		return this;
	}
	

	public String amountDue() {
		return getAmountDue();
	}
	

	public void setFormattedAmountDue(String formattedAmountDue) {
		this.formattedAmountDue = formattedAmountDue;
	}
	

	public String getFormattedAmountDue() {
		return this.formattedAmountDue;
	}
	

	public PaymentMethod formattedAmountDue(String formattedAmountDue) {
		setFormattedAmountDue(formattedAmountDue);
		return this;
	}
	

	public String formattedAmountDue() {
		return getFormattedAmountDue();
	}
	

	public void setPrice(String price) {
		this.price = price;
	}
	

	public String getPrice() {
		return this.price;
	}
	

	public PaymentMethod price(String price) {
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
	

	public PaymentMethod formattedPrice(String formattedPrice) {
		setFormattedPrice(formattedPrice);
		return this;
	}
	

	public String formattedPrice() {
		return getFormattedPrice();
	}
	

	public void setAmount(String amount) {
		this.amount = amount;
	}
	

	public String getAmount() {
		return this.amount;
	}
	

	public PaymentMethod amount(String amount) {
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
	

	public PaymentMethod formattedAmount(String formattedAmount) {
		setFormattedAmount(formattedAmount);
		return this;
	}
	

	public String formattedAmount() {
		return getFormattedAmount();
	}
	

	public void setWireTransfer(String wireTransfer) {
		this.wireTransfer = wireTransfer;
	}
	

	public String getWireTransfer() {
		return this.wireTransfer;
	}
	

	public PaymentMethod wireTransfer(String wireTransfer) {
		setWireTransfer(wireTransfer);
		return this;
	}
	

	public String wireTransfer() {
		return getWireTransfer();
	}
	

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
	

	public String getCreditCard() {
		return this.creditCard;
	}
	

	public PaymentMethod creditCard(String creditCard) {
		setCreditCard(creditCard);
		return this;
	}
	

	public String creditCard() {
		return getCreditCard();
	}
	

	public void setPaypalAccount(String paypalAccount) {
		this.paypalAccount = paypalAccount;
	}
	

	public String getPaypalAccount() {
		return this.paypalAccount;
	}
	

	public PaymentMethod paypalAccount(String paypalAccount) {
		setPaypalAccount(paypalAccount);
		return this;
	}
	

	public String paypalAccount() {
		return getPaypalAccount();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		PaymentMethod x = (PaymentMethod)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.orderId, x.orderId)
			&& Objects.equals(this.paymentTypeId, x.paymentTypeId)
			&& Objects.equals(this.paymentSourceId, x.paymentSourceId)
			&& Objects.equals(this.paymentSourceResource, x.paymentSourceResource)
			&& Objects.equals(this.gatewayId, x.gatewayId)
			&& Objects.equals(this.billingRecipientId, x.billingRecipientId)
			&& Objects.equals(this.billingAddressId, x.billingAddressId)
			&& Objects.equals(this.priceCents, x.priceCents)
			&& Objects.equals(this.amountCents, x.amountCents)
			&& Objects.equals(this.redirectUrl, x.redirectUrl)
			&& Objects.equals(this.order, x.order)
			&& Objects.equals(this.paymentType, x.paymentType)
			&& Objects.equals(this.gateway, x.gateway)
			&& Objects.equals(this.billingRecipient, x.billingRecipient)
			&& Objects.equals(this.billingAddress, x.billingAddress)
			&& Objects.equals(this.paymentSource, x.paymentSource)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.transactions, x.transactions)
			&& Objects.equals(this.invoices, x.invoices)
			&& Objects.equals(this.taxAmount, x.taxAmount)
			&& Objects.equals(this.formattedTaxAmount, x.formattedTaxAmount)
			&& Objects.equals(this.taxableAmount, x.taxableAmount)
			&& Objects.equals(this.formattedTaxableAmount, x.formattedTaxableAmount)
			&& Objects.equals(this.paidAmount, x.paidAmount)
			&& Objects.equals(this.formattedPaidAmount, x.formattedPaidAmount)
			&& Objects.equals(this.refundedAmount, x.refundedAmount)
			&& Objects.equals(this.formattedRefundedAmount, x.formattedRefundedAmount)
			&& Objects.equals(this.amountDue, x.amountDue)
			&& Objects.equals(this.formattedAmountDue, x.formattedAmountDue)
			&& Objects.equals(this.price, x.price)
			&& Objects.equals(this.formattedPrice, x.formattedPrice)
			&& Objects.equals(this.amount, x.amount)
			&& Objects.equals(this.formattedAmount, x.formattedAmount)
			&& Objects.equals(this.wireTransfer, x.wireTransfer)
			&& Objects.equals(this.creditCard, x.creditCard)
			&& Objects.equals(this.paypalAccount, x.paypalAccount)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, orderId, paymentTypeId, paymentSourceId, paymentSourceResource,
			gatewayId, billingRecipientId, billingAddressId, priceCents, amountCents,
			redirectUrl, order, paymentType, gateway, billingRecipient,
			billingAddress, paymentSource, versions, transactions, invoices,
			taxAmount, formattedTaxAmount, taxableAmount, formattedTaxableAmount, paidAmount,
			formattedPaidAmount, refundedAmount, formattedRefundedAmount, amountDue, formattedAmountDue,
			price, formattedPrice, amount, formattedAmount, wireTransfer,
			creditCard, paypalAccount 
		);
	
	}
	

	@Override
	public PaymentMethod clone() {
	
		PaymentMethod no = new PaymentMethod();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.orderId = this.orderId;
		no.paymentTypeId = this.paymentTypeId;
		no.paymentSourceId = this.paymentSourceId;
		no.paymentSourceResource = this.paymentSourceResource;
		no.gatewayId = this.gatewayId;
		no.billingRecipientId = this.billingRecipientId;
		no.billingAddressId = this.billingAddressId;
		no.priceCents = this.priceCents;
		no.amountCents = this.amountCents;
		no.redirectUrl = this.redirectUrl;
		no.order = this.order;
		no.paymentType = this.paymentType;
		no.gateway = this.gateway;
		no.billingRecipient = this.billingRecipient;
		no.billingAddress = this.billingAddress;
		no.paymentSource = this.paymentSource;
		no.versions = this.versions;
		no.transactions = this.transactions;
		no.invoices = this.invoices;
		no.taxAmount = this.taxAmount;
		no.formattedTaxAmount = this.formattedTaxAmount;
		no.taxableAmount = this.taxableAmount;
		no.formattedTaxableAmount = this.formattedTaxableAmount;
		no.paidAmount = this.paidAmount;
		no.formattedPaidAmount = this.formattedPaidAmount;
		no.refundedAmount = this.refundedAmount;
		no.formattedRefundedAmount = this.formattedRefundedAmount;
		no.amountDue = this.amountDue;
		no.formattedAmountDue = this.formattedAmountDue;
		no.price = this.price;
		no.formattedPrice = this.formattedPrice;
		no.amount = this.amount;
		no.formattedAmount = this.formattedAmount;
		no.wireTransfer = this.wireTransfer;
		no.creditCard = this.creditCard;
		no.paypalAccount = this.paypalAccount;
	
		return no;
	
	}
	
}
