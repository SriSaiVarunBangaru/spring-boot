package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.service.productInterface;

@RestController
@RequestMapping("/v1")
public class productController {
	
	@Autowired
	productInterface ProductInterface;
	
	
	
	

	
	
}
