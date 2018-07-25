package com.packt.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.packt.webstore.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService costumerService;
	
	@RequestMapping("/customers")
	public String list(Model model) {
		model.addAttribute("costumers", costumerService.getAllCustomers());
		return "customers";
	}
}
