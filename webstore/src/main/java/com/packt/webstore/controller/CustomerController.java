package com.packt.webstore.controller;


import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.packt.websotre.exception.NoCustomerFoundException;
import com.packt.webstore.domain.Customer;

import com.packt.webstore.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping
	public String List_Customers(Model model) {
		List<Customer> customers = customerService.getAllCustomers();
		if (customers == null || customers.isEmpty()) {
			throw new NoCustomerFoundException();
		}
		model.addAttribute("customers", customers);
		return "customers";
	}

	@RequestMapping("/profile")
	public String getProductById(@RequestParam("id") String customerId, Model model) {
		model.addAttribute("customer", customerService.getCustomerById(customerId));
		return "customer_profile";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String getAddNewCustomerForm(Model model) {
		Customer nweCustomer = new Customer();
		model.addAttribute("newCustomer", nweCustomer);
		return "addCustomer";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewCustomerForm(@ModelAttribute("newCustomer") Customer newCustomer) throws IOException {
		customerService.addCustomer(newCustomer);
		return "redirect:/customers";
	}
}