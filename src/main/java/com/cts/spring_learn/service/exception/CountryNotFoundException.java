package com.cts.spring_learn.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Country not found")
public class CountryNotFoundException extends Exception{
	private static final long serialVersionUID = 1L;
	public CountryNotFoundException(String s) {
		super(s);
	}
}