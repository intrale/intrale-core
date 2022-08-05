package ar.com.intrale.messages;

import java.util.ArrayList;
import java.util.Collection;

import io.micronaut.http.HttpStatus;

public class FunctionExceptionResponse extends Response {
	
	private Collection<Error> errors = new ArrayList<Error>();
	
	public FunctionExceptionResponse() {
		this.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.getCode());
	}
	
	public FunctionExceptionResponse(Collection<Error> errors) {
		this.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.getCode());
		this.errors = errors;
	}

	public Collection<Error> getErrors() {
		return errors;
	}

	public void setErrors(Collection<Error> errors) {
		this.errors = errors;
	}
	

}
