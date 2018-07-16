package com.packt.webstore.domain.repository.impl;

import java.math.BigDecimal;
import java.util.List;

import com.packt.webstore.domain.Costumer;
import com.packt.webstore.domain.repository.CostumerRepository;

public class InMemoryCostumerRepositoryImpl implements CostumerRepository {
	List<Costumer> listOfCostumers;
	public InMemoryCostumerRepositoryImpl() {
		Costumer costumer1 = new Costumer("001", "Aymane", "Rabt, Res AHSAN DAR, 475, Morocco", new BigDecimal(354));
		Costumer costumer2 = new Costumer("002", "Nada", "Morocco, Fez, 789 Lot Essaada", new BigDecimal(107));
		
		listOfCostumers.add(costumer1);
		listOfCostumers.add(costumer2);
	}
	

	@Override
	public List<Costumer> getAllCostumers() {
		return listOfCostumers;
	}
}
