package com.packt.webstore.service.impl;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;
import com.packt.webstore.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

	public Product getProductById(String productID) {
		return productRepository.getProductById(productID);
	}
	
	public List<Product> getProductsByCategory(String category) {
		return productRepository.getProductsByCategory(category);
	}

	public Set<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
		return productRepository.getProductsByFilter(filterParams);
	}
	
	public void addProduct(Product product) {
		productRepository.addProduct(product);
	}

	public void ReadProducts() throws IOException {
		productRepository.ReadProducts();
	}

	public void WriteProducts() throws IOException {
		productRepository.WriteProducts();		
	}
	
	public List<Product> getProductsByManufacturer(String manufacturer) {
		return productRepository.getProductsByManufacturer(manufacturer);
	}
	
	public Set<Product> getProductsByPrice(int low, int high) {
		return productRepository.getProductsByPrice(low, high);
	}
}

	
