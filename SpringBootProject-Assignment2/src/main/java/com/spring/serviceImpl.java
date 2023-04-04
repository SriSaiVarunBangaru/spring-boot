package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class serviceImpl implements service{

	
	@Autowired
	private repository Repository;

	@Override
	public void updateproduct(model prod, int id) {
		
		model model2=Repository.findById(id).orElse(null);
		model2.setDescription(prod.getDescription());
		model2.setPriority(prod.getPriority());
		Repository.save(model2);
		
	}
	
	
}
