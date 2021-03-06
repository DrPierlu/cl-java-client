package io.commercelayer.api.model;

import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import java.util.List;
import java.util.Objects;


/**
 * Transaction
 */
public class Transaction extends ApiResource {

	private static final long serialVersionUID = -1L;


	private String amount;
	private Integer amountCents;
	private String avsCode;
	private String avsMessage;
	private String checkoutUrl;
	private Integer currencyId;
	private String cvvCode;
	private String cvvMessage;
	private String errorCode;
	private String errorDetail;
	private String formattedAmount;
	private Integer gatewayId;
	private String kind;
	private String message;
	private String name;
	private Integer orderId;
	private Integer paymentMethodId;
	private Integer paymentSourceId;
	private String paymentSourceResource;
	private Integer referenceTransactionId;
	private String state;
	private String token;
	private List<String> versions;
	@JsonExclude
	private Object currency;
	@JsonExclude
	private Object gateway;
	@JsonExclude
	private Object invoice;
	@JsonExclude
	private Object order;
	@JsonExclude
	private Object paymentMethod;
	@JsonExclude
	private Object paymentSource;
	@JsonExclude
	private Object referenceTransaction;


	public Transaction() {
		super();
	}
	

	public Transaction(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public Transaction name(String name) {
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
	

	public Transaction orderId(Integer orderId) {
		setOrderId(orderId);
		return this;
	}
	

	public Integer orderId() {
		return getOrderId();
	}
	

	public void setGatewayId(Integer gatewayId) {
		this.gatewayId = gatewayId;
	}
	

	public Integer getGatewayId() {
		return this.gatewayId;
	}
	

	public Transaction gatewayId(Integer gatewayId) {
		setGatewayId(gatewayId);
		return this;
	}
	

	public Integer gatewayId() {
		return getGatewayId();
	}
	

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}
	

	public Integer getCurrencyId() {
		return this.currencyId;
	}
	

	public Transaction currencyId(Integer currencyId) {
		setCurrencyId(currencyId);
		return this;
	}
	

	public Integer currencyId() {
		return getCurrencyId();
	}
	

	public void setPaymentSourceResource(String paymentSourceResource) {
		this.paymentSourceResource = paymentSourceResource;
	}
	

	public String getPaymentSourceResource() {
		return this.paymentSourceResource;
	}
	

	public Transaction paymentSourceResource(String paymentSourceResource) {
		setPaymentSourceResource(paymentSourceResource);
		return this;
	}
	

	public String paymentSourceResource() {
		return getPaymentSourceResource();
	}
	

	public void setPaymentSourceId(Integer paymentSourceId) {
		this.paymentSourceId = paymentSourceId;
	}
	

	public Integer getPaymentSourceId() {
		return this.paymentSourceId;
	}
	

	public Transaction paymentSourceId(Integer paymentSourceId) {
		setPaymentSourceId(paymentSourceId);
		return this;
	}
	

	public Integer paymentSourceId() {
		return getPaymentSourceId();
	}
	

	public void setPaymentMethodId(Integer paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}
	

	public Integer getPaymentMethodId() {
		return this.paymentMethodId;
	}
	

	public Transaction paymentMethodId(Integer paymentMethodId) {
		setPaymentMethodId(paymentMethodId);
		return this;
	}
	

	public Integer paymentMethodId() {
		return getPaymentMethodId();
	}
	

	public void setReferenceTransactionId(Integer referenceTransactionId) {
		this.referenceTransactionId = referenceTransactionId;
	}
	

	public Integer getReferenceTransactionId() {
		return this.referenceTransactionId;
	}
	

	public Transaction referenceTransactionId(Integer referenceTransactionId) {
		setReferenceTransactionId(referenceTransactionId);
		return this;
	}
	

	public Integer referenceTransactionId() {
		return getReferenceTransactionId();
	}
	

	public void setToken(String token) {
		this.token = token;
	}
	

	public String getToken() {
		return this.token;
	}
	

	public Transaction token(String token) {
		setToken(token);
		return this;
	}
	

	public String token() {
		return getToken();
	}
	

	public void setKind(String kind) {
		this.kind = kind;
	}
	

	public String getKind() {
		return this.kind;
	}
	

	public Transaction kind(String kind) {
		setKind(kind);
		return this;
	}
	

	public String kind() {
		return getKind();
	}
	

	public void setAmountCents(Integer amountCents) {
		this.amountCents = amountCents;
	}
	

	public Integer getAmountCents() {
		return this.amountCents;
	}
	

	public Transaction amountCents(Integer amountCents) {
		setAmountCents(amountCents);
		return this;
	}
	

	public Integer amountCents() {
		return getAmountCents();
	}
	

	public void setState(String state) {
		this.state = state;
	}
	

	public String getState() {
		return this.state;
	}
	

	public Transaction state(String state) {
		setState(state);
		return this;
	}
	

	public String state() {
		return getState();
	}
	

	public void setMessage(String message) {
		this.message = message;
	}
	

	public String getMessage() {
		return this.message;
	}
	

	public Transaction message(String message) {
		setMessage(message);
		return this;
	}
	

	public String message() {
		return getMessage();
	}
	

	public void setCheckoutUrl(String checkoutUrl) {
		this.checkoutUrl = checkoutUrl;
	}
	

	public String getCheckoutUrl() {
		return this.checkoutUrl;
	}
	

	public Transaction checkoutUrl(String checkoutUrl) {
		setCheckoutUrl(checkoutUrl);
		return this;
	}
	

	public String checkoutUrl() {
		return getCheckoutUrl();
	}
	

	public void setAvsCode(String avsCode) {
		this.avsCode = avsCode;
	}
	

	public String getAvsCode() {
		return this.avsCode;
	}
	

	public Transaction avsCode(String avsCode) {
		setAvsCode(avsCode);
		return this;
	}
	

	public String avsCode() {
		return getAvsCode();
	}
	

	public void setAvsMessage(String avsMessage) {
		this.avsMessage = avsMessage;
	}
	

	public String getAvsMessage() {
		return this.avsMessage;
	}
	

	public Transaction avsMessage(String avsMessage) {
		setAvsMessage(avsMessage);
		return this;
	}
	

	public String avsMessage() {
		return getAvsMessage();
	}
	

	public void setCvvCode(String cvvCode) {
		this.cvvCode = cvvCode;
	}
	

	public String getCvvCode() {
		return this.cvvCode;
	}
	

	public Transaction cvvCode(String cvvCode) {
		setCvvCode(cvvCode);
		return this;
	}
	

	public String cvvCode() {
		return getCvvCode();
	}
	

	public void setCvvMessage(String cvvMessage) {
		this.cvvMessage = cvvMessage;
	}
	

	public String getCvvMessage() {
		return this.cvvMessage;
	}
	

	public Transaction cvvMessage(String cvvMessage) {
		setCvvMessage(cvvMessage);
		return this;
	}
	

	public String cvvMessage() {
		return getCvvMessage();
	}
	

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	

	public String getErrorCode() {
		return this.errorCode;
	}
	

	public Transaction errorCode(String errorCode) {
		setErrorCode(errorCode);
		return this;
	}
	

	public String errorCode() {
		return getErrorCode();
	}
	

	public void setErrorDetail(String errorDetail) {
		this.errorDetail = errorDetail;
	}
	

	public String getErrorDetail() {
		return this.errorDetail;
	}
	

	public Transaction errorDetail(String errorDetail) {
		setErrorDetail(errorDetail);
		return this;
	}
	

	public String errorDetail() {
		return getErrorDetail();
	}
	

	public void setOrder(Object order) {
		this.order = order;
	}
	

	public Object getOrder() {
		return this.order;
	}
	

	public Transaction order(Object order) {
		setOrder(order);
		return this;
	}
	

	public Object order() {
		return getOrder();
	}
	

	public void setGateway(Object gateway) {
		this.gateway = gateway;
	}
	

	public Object getGateway() {
		return this.gateway;
	}
	

	public Transaction gateway(Object gateway) {
		setGateway(gateway);
		return this;
	}
	

	public Object gateway() {
		return getGateway();
	}
	

	public void setCurrency(Object currency) {
		this.currency = currency;
	}
	

	public Object getCurrency() {
		return this.currency;
	}
	

	public Transaction currency(Object currency) {
		setCurrency(currency);
		return this;
	}
	

	public Object currency() {
		return getCurrency();
	}
	

	public void setReferenceTransaction(Object referenceTransaction) {
		this.referenceTransaction = referenceTransaction;
	}
	

	public Object getReferenceTransaction() {
		return this.referenceTransaction;
	}
	

	public Transaction referenceTransaction(Object referenceTransaction) {
		setReferenceTransaction(referenceTransaction);
		return this;
	}
	

	public Object referenceTransaction() {
		return getReferenceTransaction();
	}
	

	public void setPaymentSource(Object paymentSource) {
		this.paymentSource = paymentSource;
	}
	

	public Object getPaymentSource() {
		return this.paymentSource;
	}
	

	public Transaction paymentSource(Object paymentSource) {
		setPaymentSource(paymentSource);
		return this;
	}
	

	public Object paymentSource() {
		return getPaymentSource();
	}
	

	public void setPaymentMethod(Object paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	

	public Object getPaymentMethod() {
		return this.paymentMethod;
	}
	

	public Transaction paymentMethod(Object paymentMethod) {
		setPaymentMethod(paymentMethod);
		return this;
	}
	

	public Object paymentMethod() {
		return getPaymentMethod();
	}
	

	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	

	public List<String> getVersions() {
		return this.versions;
	}
	

	public Transaction versions(List<String> versions) {
		setVersions(versions);
		return this;
	}
	

	public List<String> versions() {
		return getVersions();
	}
	

	public void setInvoice(Object invoice) {
		this.invoice = invoice;
	}
	

	public Object getInvoice() {
		return this.invoice;
	}
	

	public Transaction invoice(Object invoice) {
		setInvoice(invoice);
		return this;
	}
	

	public Object invoice() {
		return getInvoice();
	}
	

	public void setAmount(String amount) {
		this.amount = amount;
	}
	

	public String getAmount() {
		return this.amount;
	}
	

	public Transaction amount(String amount) {
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
	

	public Transaction formattedAmount(String formattedAmount) {
		setFormattedAmount(formattedAmount);
		return this;
	}
	

	public String formattedAmount() {
		return getFormattedAmount();
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		Transaction x = (Transaction)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.orderId, x.orderId)
			&& Objects.equals(this.gatewayId, x.gatewayId)
			&& Objects.equals(this.currencyId, x.currencyId)
			&& Objects.equals(this.paymentSourceResource, x.paymentSourceResource)
			&& Objects.equals(this.paymentSourceId, x.paymentSourceId)
			&& Objects.equals(this.paymentMethodId, x.paymentMethodId)
			&& Objects.equals(this.referenceTransactionId, x.referenceTransactionId)
			&& Objects.equals(this.token, x.token)
			&& Objects.equals(this.kind, x.kind)
			&& Objects.equals(this.amountCents, x.amountCents)
			&& Objects.equals(this.state, x.state)
			&& Objects.equals(this.message, x.message)
			&& Objects.equals(this.checkoutUrl, x.checkoutUrl)
			&& Objects.equals(this.avsCode, x.avsCode)
			&& Objects.equals(this.avsMessage, x.avsMessage)
			&& Objects.equals(this.cvvCode, x.cvvCode)
			&& Objects.equals(this.cvvMessage, x.cvvMessage)
			&& Objects.equals(this.errorCode, x.errorCode)
			&& Objects.equals(this.errorDetail, x.errorDetail)
			&& Objects.equals(this.order, x.order)
			&& Objects.equals(this.gateway, x.gateway)
			&& Objects.equals(this.currency, x.currency)
			&& Objects.equals(this.referenceTransaction, x.referenceTransaction)
			&& Objects.equals(this.paymentSource, x.paymentSource)
			&& Objects.equals(this.paymentMethod, x.paymentMethod)
			&& Objects.equals(this.versions, x.versions)
			&& Objects.equals(this.invoice, x.invoice)
			&& Objects.equals(this.amount, x.amount)
			&& Objects.equals(this.formattedAmount, x.formattedAmount)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, orderId, gatewayId, currencyId, paymentSourceResource,
			paymentSourceId, paymentMethodId, referenceTransactionId, token, kind,
			amountCents, state, message, checkoutUrl, avsCode,
			avsMessage, cvvCode, cvvMessage, errorCode, errorDetail,
			order, gateway, currency, referenceTransaction, paymentSource,
			paymentMethod, versions, invoice, amount, formattedAmount
			
		);
	
	}
	

	@Override
	public Transaction clone() {
	
		Transaction no = new Transaction();
	
		no = super.clone(no);
	
		no.name = this.name;
		no.orderId = this.orderId;
		no.gatewayId = this.gatewayId;
		no.currencyId = this.currencyId;
		no.paymentSourceResource = this.paymentSourceResource;
		no.paymentSourceId = this.paymentSourceId;
		no.paymentMethodId = this.paymentMethodId;
		no.referenceTransactionId = this.referenceTransactionId;
		no.token = this.token;
		no.kind = this.kind;
		no.amountCents = this.amountCents;
		no.state = this.state;
		no.message = this.message;
		no.checkoutUrl = this.checkoutUrl;
		no.avsCode = this.avsCode;
		no.avsMessage = this.avsMessage;
		no.cvvCode = this.cvvCode;
		no.cvvMessage = this.cvvMessage;
		no.errorCode = this.errorCode;
		no.errorDetail = this.errorDetail;
		no.order = this.order;
		no.gateway = this.gateway;
		no.currency = this.currency;
		no.referenceTransaction = this.referenceTransaction;
		no.paymentSource = this.paymentSource;
		no.paymentMethod = this.paymentMethod;
		no.versions = this.versions;
		no.invoice = this.invoice;
		no.amount = this.amount;
		no.formattedAmount = this.formattedAmount;
	
		return no;
	
	}
	
}
