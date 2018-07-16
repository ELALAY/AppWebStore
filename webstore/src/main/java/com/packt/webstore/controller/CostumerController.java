package com.packt.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.packt.webstore.domain.repository.CostumerRepository;

@Controller
public class CostumerController {
	@Autowired
	private CostumerRepository costumerRepository;
	
	@RequestMapping("/cotumers")	
	public String List(Model model) {
		String str = "costumers";
		model.addAttribute("costumers", costumerRepository.getAllCostumers());
		return str;
	}
}
