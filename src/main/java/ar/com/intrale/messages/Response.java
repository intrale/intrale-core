package ar.com.intrale.messages;

import io.micronaut.http.HttpStatus;

public class Response {
	
	private Integer statusCode = HttpStatus.OK.getCode();

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	
	
}
