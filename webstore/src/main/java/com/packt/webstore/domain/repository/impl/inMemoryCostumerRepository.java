package com.packt.webstore.domain.repository.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Costumer;

@Repository
public class inMemoryCostumerRepository {
	private List<Costumer> listOfCostumers = new ArrayList<Costumer>();

	public inMemoryCostumerRepository() {
		
		Costumer gold = new Costumer();
		gold.setCostumerId("001");
		gold.setFullName("toto");
		gold.setAddress("475, Rabat, Morocco");
		gold.setNoOfOrdersMade(new BigDecimal(345));
		
		Costumer plat = new Costumer();
		plat.setCostumerId("002");
		plat.setFullName("foo");
		plat.setAddress("475, Rabat, Morocco");
		plat.setNoOfOrdersMade(new BigDecimal(100));
		
		Costumer diamond = new Costumer();
		diamond.setCostumerId("003");
		diamond.setFullName("lili");
		diamond.setAddress("475, Rabat, Morocco");
		diamond.setNoOfOrdersMade(new BigDecimal(500));
		
		listOfCostumers.add(gold);
		listOfCostumers.add(plat);
		listOfCostumers.add(diamond);
	}

	public List<Costumer> getAllCostumers() {
		return this.listOfCostumers;
	}

	public Costumer getCostumerById(String CostumerId) {
		Costumer costumerById = null;

		for (Costumer costumer : listOfCostumers) {
			if (costumer != null &&  costumer.getCostumerId() != null &&  costumer.getCostumerId().equals(CostumerId)) {
				costumerById = costumer;
				break;
			}
		}
		if (costumerById == null) 
			throw new IllegalArgumentException("No Costumer found with the Costumer id"+CostumerId);
		return costumerById;
	}
}