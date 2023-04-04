package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product_Details")
public class productModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String prodName;
	int prodCost;
	
	public productModel() {
		
	}
	
	
	public productModel(int id, String prodName, int prodCost) {
		super();
		this.id = id;
		this.prodName = prodName;
		this.prodCost = prodCost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getProdCost() {
		return prodCost;
	}
	public void setProdCost(int prodCost) {
		this.prodCost = prodCost;
	}
	@Override
	public String toString() {
		return "productModel [id=" + id + ", prodName=" + prodName + ", prodCost=" + prodCost + "]";
	}
	
	

}
