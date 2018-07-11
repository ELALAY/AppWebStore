package com.packt.webstore.service;

import java.util.List;
import com.packt.webstore.domain.Product;

public interface ProductService {
	List<Product> getAllProducts();
	
	List<Product> getProductByCategory(String category);
	
}