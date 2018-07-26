package com.packt.webstore.domain;

public class Customer {
	private String customerId;
	private String customerName;
	private String customerAddress;
	private long customerNoOfOrdersMade;
	
	public Customer() {
		
	}
	
	public Customer (String CustomerName, String CustomerAddress) {
		this.customerName = CustomerName;
		this.customerAddress = CustomerAddress;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public long getCustomerNoOfOrdersMade() {
		return customerNoOfOrdersMade;
	}

	public void setCustomerNoOfOrdersMade(long customerNoOfOrdersMade) {
		this.customerNoOfOrdersMade = customerNoOfOrdersMade;
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
		if (customerAddress == null) {
			if (other.customerAddress != null)
				return false;
		} else if (!customerAddress.equals(other.customerAddress))
			return false;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (customerNoOfOrdersMade == 0) {
			if (other.customerNoOfOrdersMade != 0)
				return false;
		} else if (customerNoOfOrdersMade != other.customerNoOfOrdersMade)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [CustomerId=" + customerId + ", CustomerName=" + customerName + ", CustomerAddress="
				+ customerAddress + ", CustomerNoOfOrdersMade=" + customerNoOfOrdersMade + "]";
	}
	
	
	
}
