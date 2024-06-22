package com.demomicrob.demoservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demomicrob.demoservices.entity.Product;
import com.demomicrob.demoservices.repo.ProductRepo;
import com.github.andrewoma.dexx.collection.List;

@Service
public class ProductService {
   @Autowired
   ProductRepo productrepo;
   
    //create
	public Product create(Product product) {
		return productrepo.save(product);	
	}

	/*public List <Product> getAll() {
		
		return productrepo.getAll() ;
	}*/

	

	
	
	
	
	
	
}
