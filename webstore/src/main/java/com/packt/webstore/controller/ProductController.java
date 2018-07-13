package com.packt.webstore.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.packt.webstore.domain.repository.ProductRepository;

@Controller
public class ProductController {
	
	@RequestMapping("/products")
	public String list(Model model) {
		String str = "products";
		model.addAttribute("products", productRepository.getAllProducts());

		return str;
	}
	
	@Autowired
	private ProductRepository productRepository;
	
}
