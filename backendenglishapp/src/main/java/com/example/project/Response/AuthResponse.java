package com.example.project.Response;

public class AuthResponse {
	
	private String token;
	
	private String message;
	
	public AuthResponse(String token, String message) {
		this.message = message;
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
