package com.spring.exception;

public class ProductNotFoundException extends RuntimeException {
	
	public ProductNotFoundException(String message) {
		super("Product not found" + message);
	}

}