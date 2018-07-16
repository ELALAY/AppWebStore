package com.packt.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;
import com.packt.webstore.service.ProductService;

public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	private List<Product> listOfProducts = productRepository.getAllProducts();
	
	@Overide  
	public List<Product> getAllProducts() {
		return listOfProducts;
	}

	
}
