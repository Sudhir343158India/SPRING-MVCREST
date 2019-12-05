package com.hcl.mvcrest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class GlobalException extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(SoftechErrorMessageException.class)
public  ResponseEntity<SoftechErrorMessageException>ErrormessageException(SoftechErrorMessageException ex){
		SoftechErrorMessageException error= new SoftechErrorMessageException(ex.getMessage());
 	return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
} 

}
