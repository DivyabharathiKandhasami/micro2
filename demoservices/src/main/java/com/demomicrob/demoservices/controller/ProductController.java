package com.demomicrob.demoservices.controller;
//import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demomicrob.demoservices.entity.Product;
import com.demomicrob.demoservices.service.ProductService;
import com.github.andrewoma.dexx.collection.List;

@RequestMapping("/api/start")
@RestController
public class ProductController {

	@Autowired
	ProductService productservice;

	@GetMapping("/products")
	public String Get() {
		return "products list";
	}

	@PostMapping
	public String create(@RequestBody Product product) {
		productservice.create(product);
		return "Data Saved";
	}

	/*
	 * @GetMapping public List <Product> getAll(){ return productservice.getAll(); }
	 */

}
