package com.packt.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.packt.webstore.service.ProductService;

@Controller
public class ProductController {
	
	@RequestMapping("/products")
	public String list(Model model) {
		String str = "products";
		model.addAttribute("products", productService.getAllProducts());

		return str;
	}
	
	@Autowired
	private ProductService productService;
	
}
