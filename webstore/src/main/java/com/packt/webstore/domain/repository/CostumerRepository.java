package com.packt.webstore.domain.repository;

import java.util.List;

import com.packt.webstore.domain.Costumer;

public interface CostumerRepository {
	List<Costumer> getAllCostumers();

	Costumer getCostumerByID(String CostumerID);
}