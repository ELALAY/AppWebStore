package com.packt.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.packt.webstore.service.CostumerService;
import com.packt.webstore.service.impl.CostumerServiceImpl;

@Controller 
public class CostumerController {
	@Autowired
	private CostumerService costumerService;

	@RequestMapping("/costumers")
	public  String List(Model model) {
		model.addAttribute("costumers", costumerService.getAllCostumers());
		return "costumers";
	}
}