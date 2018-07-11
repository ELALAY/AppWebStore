package com.packt.webstore.domain;

import java.math.BigDecimal;

public class Costumer{

	private String CostumerId;
	private String FullName;
	private String Address;
	private BigDecimal NoOfOrdersMade;
	
	public Costumer() {
		super();
	}

	public Costumer(String CostumerId, String FullName, String Address, BigDecimal NoOfOrdersMade) {
		this.CostumerId = CostumerId;
		this.FullName = FullName;
		this.Address = Address;
		this.NoOfOrdersMade = NoOfOrdersMade;
	}

	public String getCostumerId() {
		return this.CostumerId;
	}

	public void setCostumerId(String CostumerId) {
		this.CostumerId = CostumerId;
	}
	
	public String getFullName() {
		return this.FullName;
	}

	public void setFullName(String FullName) {
		this.FullName = FullName;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}

	public String getAddress() {
		return this.Address;
	}

	public BigDecimal getNoOfOrdersMade() {
		return this.NoOfOrdersMade;
	}

	public void setNoOfOrdersMade(BigDecimal NoOfOrdersMade) {
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