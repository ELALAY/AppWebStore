package com.packt.webstore.domain;

import java.math.BigDecimal;

public class Costumer {
	private String CostumerId;
	private String Name;
	private String Address;
	private BigDecimal noOfOrdersMade;
	
	public Costumer(String CostumerId, String Name, String Address, BigDecimal noOfOrdersMade) {
		this.CostumerId = CostumerId;
		this.Name = Name;
		this.Address = Address;
		this.noOfOrdersMade = noOfOrdersMade;
	}
	
	public String getCostumerId() {
		return this.CostumerId;
	}
	
	public void setCostumerId(String CostumerId) {
		this.CostumerId = CostumerId;
	}
	
	public String getName() {
		return this.Name;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public String getAddress() {
		return this.Address;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}
	
	public BigDecimal getNoOfOrdersMade() {
		return this.noOfOrdersMade;
	}
	
	public void setNoOfOrdersMade(BigDecimal noBigDecimal) {
		this.noOfOrdersMade = noBigDecimal;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;

		Costumer other = (Costumer) obj;
	
		if (CostumerId == null) {
			if (other.CostumerId != null) return false;
		} else if (!CostumerId.equals(other.CostumerId))	return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 32;
		int result = 1;
		result = prime * result + ((CostumerId == null) ? 0 : CostumerId.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Product [productId=" + CostumerId + ", name=" + Name + "]";
	}
	
}

