package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.model.productModel;
import com.spring.repository.productRepository;

public class productServiceImpl implements productService{
	
	@Autowired
	private productRepository ProductRepository;

	@Override
	public void addProduct(productModel Model) {
		
		ProductRepository.save(Model);
		
	}


	@Override
	public productModel findProductById(int id) {
		
		productModel model =ProductRepository.findById(id).get();
		return model;
	}


	@Override
	public void  deleteProductById(int id) {
		
	   ProductRepository.deleteById(id);
	     
	}





	@Override
	public void updateproduct(productModel prod, int id) {
		
		productModel model2=ProductRepository.findById(id).orElse(null);
		model2.setProductName(prod.getProductName());
		model2.setProductCost(prod.getProductCost());
		ProductRepository.save(model2);
		
		
	}
	
	




	
	
	
	
	

}
