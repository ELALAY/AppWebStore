package com.packt.webstore.domain;

import java.math.BigDecimal;

public class Costumer{

	private String CostumerId;
	private String FullName;
	private String Address;
	private BigDecimal NoOfOrdersMade;

	String getCostumerId() {
		return this.CostumerId;
	}

	void setCostumerId(String CostumerId) {
		this.CostumerId = CostumerId;
	}
	
	String getFullName() {
		return this.FullName;
	}

	void setFullName(String FullName) {
		this.FullName = FullName;
	}

	void setAddress(String Address) {
		this.Address = Address;
	}

	String getAddress() {
		return this.Address;
	}

	BigDecimal getNoOfOrdersMade() {
		return this.NoOfOrdersMade;
	}

	void setNoOfOrdersMade(BigDecimal NoOfOrdersMade) {
		this.NoOfOrdersMade = NoOfOrdersMade;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Costumer other = (Costumer) obj;
		if (CostumerId == null)
			if (other.CostumerId != null) return false;
		else if (!CostumerId.equals(other.CostumerId)) return false;
		return true; 
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CostumerId == null) ? 0 : CostumerId.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Product [productId=" + CostumerId + ", name=" + FullName + "]";
	}

}