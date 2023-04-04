package com.spring.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.exception.ProductNotFoundException;
import com.spring.model.productModel;
import com.spring.repository.productRepository;
import com.spring.service.productService;

@RestController
@RequestMapping("/v1")
public class productController {
	
    @Autowired
	private productService ProductService;
	
    
    @Autowired
    private productRepository ProductRepository;
    
    
    @PostMapping("/add")
    public void createProduct(productModel Model) {
    	ProductService.addProduct(Model);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteProduct(int id) {
    	ProductService.deleteProductById(id);
    }
    
    @GetMapping("/find/{id}")
    public productModel findProductById(int id) {
    	productModel Model=ProductService.findProductById(id);
    	return Model;	
    }
    
    @GetMapping("/find/{productName}")
    public productModel findProductByName(String productName) {
    	productModel model1=ProductRepository.findProductByName(productName);
    	return model1;
    }
    

    @PutMapping("/update/{id}")
    public ResponseEntity<productModel> updateoneproduct(@RequestBody productModel prod,@PathVariable("id") int id)
    {
       Optional<productModel> prod1=ProductRepository.findById(id);
       if(prod1.isPresent()) {
           ProductService.updateproduct(prod, id);;
           return ResponseEntity.ok(prod1.get());
       }
       throw new  ProductNotFoundException("YOU ENTERED PRODUCT NOT THERE");
        
        
    }
    
    
    
    
    
	

}
