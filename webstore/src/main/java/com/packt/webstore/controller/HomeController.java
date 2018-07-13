package com.packt.webstore.controller;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.packt.webstore.domain.Product;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String welcome(Model model) {
		String str = "welcome";
		model.addAttribute("greeting", "Welcome to Web Store!");
		model.addAttribute("tagline", "The one and only amazing webstore");		
		System.out.println("Here in the homecontroller");
		
		return str;
	}
	
}