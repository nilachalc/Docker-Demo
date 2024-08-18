package com.example.docker.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class VehicleNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public VehicleNotFoundException() {
		super();
	}

	public VehicleNotFoundException(String message) {
		super(message);
	}
}
