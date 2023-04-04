package com.spring.service;

import com.spring.model.productModel;

public interface productInterface {
	
	public void addproducts(productModel model);
	public void deleteProductById(int id);
	public productModel getproductById(int id);


}
