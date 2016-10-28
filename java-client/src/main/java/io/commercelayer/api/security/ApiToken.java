package io.commercelayer.api.security;

import java.time.LocalDateTime;

public final class ApiToken {

	private String accessToken;
	private String tokenType = "bearer";
	private int expiresIn;
	private String refreshToken;

	private LocalDateTime expiresFrom;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getTokenType() {
		return tokenType;
	}

	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

	public int getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(int expiresIn) {
		this.expiresIn = expiresIn;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public LocalDateTime getExpiresFrom() {
		return expiresFrom;
	}

	public void setExpiresFrom(LocalDateTime expiresFrom) {
		this.expiresFrom = expiresFrom;
	}

}
