package com.packt.webstore.domain.repository

public interface ProductRepository  {
	List <Product> getAllProducts();

	Product getProductById(String productID);
}