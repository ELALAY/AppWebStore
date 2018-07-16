package com.packt.webstore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.packt.webstore.domain.Costumer;

@Service
public interface CostumerService {
	List<Costumer> getAllCostumers();
}
