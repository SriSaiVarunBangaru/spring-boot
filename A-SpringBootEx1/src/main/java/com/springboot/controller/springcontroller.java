package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class springcontroller {
	
	@RequestMapping("/go")
	public String myFirstmethod() {
		
		return "hello this is my page";
		
	}
	
	

}
