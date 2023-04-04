package com.spring.service;

import org.springframework.stereotype.Service;

import com.spring.model.productModel;

@Service
public interface productService {
	
	public void addProduct(productModel Model);
	public void  deleteProductById(int id);
	public productModel findProductById(int id);
	public void updateproduct(productModel prod,int id);
	

}
