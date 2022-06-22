package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class FlightNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(FlightNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String flightNotFoundHandler(FlightNotFoundException ex)
	{
		System.out.println("flightNotFoundHandler.....");
		return ex.getMessage() + " its not there, means 404";
	}
}
