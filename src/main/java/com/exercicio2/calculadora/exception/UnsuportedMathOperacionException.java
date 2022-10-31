package com.exercicio2.calculadora.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedMathOperacionException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public UnsuportedMathOperacionException(String exception) {
		super(exception);
	}

}
