package com.sportyshoess.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BusinessException extends RuntimeException{
	
	private static final long serialVersionUID = 1008128726286682480L;

	public BusinessException() {
		super();
	}

	public BusinessException(String message) {
		super(message);
	}

}
