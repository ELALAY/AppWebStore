package com.packt.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.packt.webstore.service.impl.ProductServiceImpl;

@Controller
public class ProductController {
	@Autowired
	private ProductServiceImpl productServiceImpl;

	@RequestMapping("/products")
	public String list(Model model) {
		model.addAttribute("products", productServiceImpl.getAllProducts());
		return "products";
	}
}