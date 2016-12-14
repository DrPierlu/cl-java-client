package io.commercelayer.api.http;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import io.commercelayer.api.http.auth.HttpAuth;

public class HttpRequest {

	public static enum Method {
		GET, PUT, POST, DELETE
	}

	private Method method;
	private String url;
	private Map<String, String> headers;
	private Map<String, String> queryStringParams;
	private String body;
	private String contentType;
	
	private HttpAuth httpAuth;
	
	public HttpRequest(Method httpMethod) {
		this.method = (httpMethod == null)? Method.GET : httpMethod;
		this.headers = new TreeMap<>();
		this.queryStringParams = new HashMap<>();
	}
	
	public HttpRequest(Method httpMethod, String url) {
		this(httpMethod);
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Map<String, String> getHeaders() {
		return headers;
	}

	public void setHeaders(Map<String, String> header) {
		this.headers = header;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public void addHeader(String header, String value) {
		this.headers.put(header, value);
	}

	public String getHeader(String header) {
		return this.headers.get(header);
	}

	public Method getMethod() {
		return method;
	}

	public void setMethod(Method method) {
		this.method = method;
	}

	public boolean hasHeaders() {
		return (this.headers != null) && !this.headers.isEmpty();
	}

	public boolean containsHeader(String header) {
		return hasHeaders() && (this.headers.containsKey(header));
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public Map<String, String> getQueryStringParams() {
		return queryStringParams;
	}

	public void setQueryStringParams(Map<String, String> queryStringParams) {
		this.queryStringParams = queryStringParams;
	}
	
	public void addQueryStringParam(String key, Object value) {
		this.queryStringParams.put(key, (value == null)? null : value.toString());
	}
	
	public void addQueryStringParam(String key, String value) {
		this.queryStringParams.put(key, value);
	}
	
	public String getQueryStringParam(String key) {
		return this.queryStringParams.get(key);
	}
	
	public boolean hasQueryStringParams() {
		return (this.queryStringParams != null) && !this.queryStringParams.isEmpty();
	}

	public HttpAuth getHttpAuth() {
		return httpAuth;
	}

	public void setHttpAuth(HttpAuth httpAuth) {
		this.httpAuth = httpAuth;
	}
	
	
	public static interface Header {
		String ACCEPT 				= "Accept";
		String PROXY_AUTHORIZATION	= "Proxy-Authorization";
		String AUTHORIZATION		= "Authorization";
	}
	
}
