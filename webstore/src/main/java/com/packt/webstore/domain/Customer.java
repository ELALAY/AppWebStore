package com.packt.webstore.domain;

public class Customer {
	private String CustomerId;
	private String CustomerName;
	private String CustomerAddress;
	private long CustomerNoOfOrdersMade;
	
	public Customer() {
		
	}
	
	public Customer (String CustomerName, String CustomerAddress) {
		this.CustomerName = CustomerName;
		this.CustomerAddress = CustomerAddress;
	}

	public String getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getCustomerAddress() {
		return CustomerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}

	public long getCustomerNoOfOrdersMade() {
		return CustomerNoOfOrdersMade;
	}

	public void setCustomerNoOfOrdersMade(long customerNoOfOrdersMade) {
		CustomerNoOfOrdersMade = customerNoOfOrdersMade;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (CustomerAddress == null) {
			if (other.CustomerAddress != null)
				return false;
		} else if (!CustomerAddress.equals(other.CustomerAddress))
			return false;
		if (CustomerId == null) {
			if (other.CustomerId != null)
				return false;
		} else if (!CustomerId.equals(other.CustomerId))
			return false;
		if (CustomerName == null) {
			if (other.CustomerName != null)
				return false;
		} else if (!CustomerName.equals(other.CustomerName))
			return false;
		if (CustomerNoOfOrdersMade == 0) {
			if (other.CustomerNoOfOrdersMade != 0)
				return false;
		} else if (CustomerNoOfOrdersMade != other.CustomerNoOfOrdersMade)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", CustomerName=" + CustomerName + ", CustomerAddress="
				+ CustomerAddress + ", CustomerNoOfOrdersMade=" + CustomerNoOfOrdersMade + "]";
	}
	
	
	
}
