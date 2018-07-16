package com.packt.webstore.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;
import com.packt.webstore.service.ProductService;

public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	private List<Product> listOfProducts = productRepository.getAllProducts();
	
	@Override  
	public List<Product> getAllProducts() {
		return listOfProducts;
	}
	
	public Product getProductById(String productId) {
		return productRepository.getProductById(productId);
	}

	public List<Product> getProductsByCategory(String category) {
		return productRepository.getProductByCategory(category);
	}
	
	public Set<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
		return productRepository.getProductsByFilter(filterParams);
	}
	
}
