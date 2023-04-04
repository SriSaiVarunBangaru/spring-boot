package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Customer;
import com.spring.service.customerServiceImpl;

@RestController
@RequestMapping("/v1")
public class customerController {
	
	@Autowired
	private customerServiceImpl CustomerServiceImpl;
	
	
	@RequestMapping("/login")
	public String doLogin() {
		return "Welcome To Railway Reservation System";
	}
	
	
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer cust) {
		
		return CustomerServiceImpl.saveCustomer(cust);
		
	}
	
	@PostMapping("/addCustomers")
	public List<Customer> addCustomers(@RequestBody List<Customer> custs) {
		
		return CustomerServiceImpl.saveAllCustomer(custs);
		
	}
	
	@GetMapping("/FetchCustomers")
	public List<Customer> FindallCustomers(){
		return CustomerServiceImpl.getCustomers();
	}
	
	@GetMapping("/FetchCustomerById/{id}")
	public Customer findCustomerById(@PathVariable int id) {
		return CustomerServiceImpl.getCustomerById(id);
	}
	
	@DeleteMapping("/deleteCustomerById/{id}")
	public String deleteCustomerById(@PathVariable int id) {
		return CustomerServiceImpl.deleteCustomerById(id);
	}
	
	
	
	
	

}
