package com.packt.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.webstore.domain.repository.*;
import com.packt.webstore.service.CostumerService;
import com.packt.webstore.domain.Costumer;

@Service
public class CostumerServiceImpl implements CostumerService{
	@Autowired
	private CostumerRepository costumerRepository;

	public List<Costumer> getAllCostumers(){
		List<Costumer> allCostumers = costumerRepository.getAllCostumers();
		return allCostumers;
	}
}