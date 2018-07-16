package com.packt.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.packt.webstore.domain.Costumer;
import com.packt.webstore.domain.repository.CostumerRepository;
import com.packt.webstore.service.CostumerService;

public class CostumerServiceImpl implements CostumerService{
	@Autowired
	private CostumerRepository costumerRepository;
	
	@Override
	public List<Costumer> getAllCostumers() {
		return costumerRepository.getAllCostumers();
	}
}
