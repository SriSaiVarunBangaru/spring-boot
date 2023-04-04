package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Customer;
import com.spring.repository.customerRepository;

@Service
public class customerServiceImpl{
	
	@Autowired
	private customerRepository CustomerRepository;
	
	public Customer saveCustomer(Customer cust) {
		
		return CustomerRepository.save(cust);	
	}
	
	public List<Customer> saveAllCustomer(List<Customer> custs){
		
		return CustomerRepository.saveAll(custs);
	}
	
    public List<Customer> getCustomers(){
    	
    	return CustomerRepository.findAll();
    	
    }
    
    public Customer getCustomerById(int id) {
    	
    	return CustomerRepository.findById(id).orElse(null);
    }
    
	/*
	 * public Customer getCustomerByName(String custName) { return
	 * CustomerRepository. }
	 */
    
    public String deleteCustomerById(int id) {
    	
    	CustomerRepository.deleteById(id);
    	return "The customer is removed" +id;
    	
    }
    
	/*
	 * public Customer updateCustomer(Customer cust) {
	 * 
	 * Customer
	 * presentCustomer=CustomerRepository.findById(cust.getId()).orElse(null);
	 * presentCustomer.setcustName()
	 * 
	 * }
	 */
    
    

}
