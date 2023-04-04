package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ProductDetails")
public class productModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String productName;
	int productCost;
	
	public productModel() {
		
	}
	
	
	public productModel(int id, String productName, int productCost) {
		super();
		this.id = id;
		this.productName = productName;
		this.productCost = productCost;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getProductCost() {
		return productCost;
	}


	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}


	@Override
	public String toString() {
		return "productModel [id=" + id + ", productName=" + productName + ", productCost=" + productCost + "]";
	}

}
