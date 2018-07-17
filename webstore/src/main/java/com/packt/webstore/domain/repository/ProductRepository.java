package com.packt.webstore.domain.repository;


import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.packt.webstore.domain.Product;

public interface ProductRepository {
	List<Product> getAllProducts();
	
	Product getProductById(String productId);
	
	List<Product> getProductByCategory(String category);
	
	Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
	
	List<Product> getProductsByManufacturer(String Manufacturer);
	
	List<Product> getProductsByPriceRange(BigDecimal low, BigDecimal high);
}
