package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.service.LoginService;

@RestController
@RequestMapping("/v2")
public class LoginController {
	
   @Autowired
   LoginService loginservice;
	
	

}
