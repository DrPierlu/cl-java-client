package io.commercelayer.api.operation.common;

import io.commercelayer.api.http.HttpRequest.Method;

public abstract class GetOperation extends ApiOperation {

	protected GetOperation(String path) {
		super(path);
	}

	@Override
	public Method getMethod() {
		return Method.GET;
	}

}