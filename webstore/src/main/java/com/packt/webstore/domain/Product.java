package com.packt.webstore.domain;

import java.math.BigDecimal;

public class Product {
	private String ProductId;
	private String Name;
	private BigDecimal unitPrice;
	private String description;
	private String manufacturer;
	private String category;
	private long unitsInStock;
	private long unitsInOrder;
	private boolean discontinued;
	private String condition;

	public Product() {
		super();
	}

	public Product(String productId, String name, BigDecimal unitPrice) {
		this.ProductId = productId;
		this.Name = name;
		this.unitPrice = unitPrice;
	}

	public String getProductId() {
		return this.ProductId;
	}

	public void setProductId(String productId) {
		this.ProductId = productId;
	}

	public String getName() {
		return this.Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manifacturer) {
		this.manufacturer = manifacturer;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public long getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public long getUnitsInOrder() {
		return unitsInOrder;
	}

	public void setUnitsInOrder(long unitsInOrder) {
		this.unitsInOrder = unitsInOrder;
	}

	public boolean isDiscontinued() {
		return discontinued;
	}

	public void setDiscontinued(boolean discontinued) {
		this.discontinued = discontinued;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;

		Product other = (Product) obj;
	
		if (ProductId == null) {
			if (other.ProductId != null) return false;
		} else if (!ProductId.equals(other.ProductId))	return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 32;
		int result = 1;
		result = prime * result + ((ProductId == null) ? 0 : ProductId.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Product [productId=" + ProductId + ", name=" + Name + "]";
	}
	
}



