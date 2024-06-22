package com.demomicrob.demoservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demomicrob.demoservices.entity.Product;
import com.github.andrewoma.dexx.collection.List;

@Repository
public interface ProductRepo extends JpaRepository <Product, Long>{

  /*	List <Product>  getAll();*/
	
	
}
