package com.zosh.request;

import lombok.Data;

@Data
public class LoginWithGooleRequest {
	
	private String credential;
	private String clientId;

	public String getCredential() {
		return credential;
	}

	public void setCredential(String credential) {
		this.credential = credential;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
}
