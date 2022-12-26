package com.gnp.demo.trupper.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.gnp.demo.trupper.exception.TrupperException;
import com.gnp.demo.trupper.model.Response;

@RestControllerAdvice
public class HttpExceptionHandler {

	@ExceptionHandler({TrupperException.class})
	public ResponseEntity<Response> handlerTrupperException(final TrupperException trupperException) {
		Response response = new Response();
		return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
	}
	
}
