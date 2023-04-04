package com.spring;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="model_details")
public class model {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private BigInteger id;
	
	@NotNull
	private String description;
	
	private int priority;
	
	public model() {
		
	}

	public model(BigInteger id, String description, int priority) {
		super();
		this.id = id;
		this.description = description;
		this.priority = priority;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "model [id=" + id + ", description=" + description + ", priority=" + priority + "]";
	}
	
	
	
	
	

}
