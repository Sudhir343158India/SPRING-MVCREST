package com.hcl.mvcrest.exception;

public class SoftechErrorMessageException extends RuntimeException {
	private static final long serialVersionUID=1L;
	public  SoftechErrorMessageException(String message) {
		super(message);
	}

}
