
package com.packt.webstore.domain;

public class Costumer{

	private String CostumerId;
	private String Address;
	private BidDecimal NoOfOrdersMade;

	String getCostumerId() {
		return this.CostumerId;
	}

	void setCostumerId(String CostumerId) {
		this.CostumerId = CostumerId;
	}

	void setAddress(String Address) {
		this.Address = Address;
	}

	String getAddress() {
		return this.Address;
	}


	String getNoOfOrdersMade() {
		return this.NoOfOrdersMade;
	}

	void setNoOfOrdersMade(String NoOfOrdersMade) {
		this.NoOfOrdersMade = NoOfOrdersMade;
	}

}