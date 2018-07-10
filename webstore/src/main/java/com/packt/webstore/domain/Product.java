package com.packt.webstore.domain;

import java.math.BigDecimal;

public class Pruduct {

	private String productId;
	private String name;
	private BigDecimal unitPrice;
	private String description;
	private String manifacturer;
	private String category;
	private long unitInStock;
	private long unitInOrder;
	private boolean discontinued;
	private String condition;

	public Product() {
		super();
	}

	public Product(Sring productId, Sring name, BigDecimal unitPrice) {
		this.productId = productId;
		this.name = name;
		this.unitPrice = unitPrice;
	}

	//getters and setters go here, they are a must!!!

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Product other = (Product) obj;
		if (productId == null)
			if (other.productId != null) return false;
		else if (!productId.equals(other.productId)) return false;
		return true; 
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + "]";
	}

}