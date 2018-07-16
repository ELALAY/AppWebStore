package com.packt.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.packt.webstore.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping
	public String list(Model model) {
		String str = "products";
		model.addAttribute("products", productService.getAllProducts());

		return str;
	}
	
	@RequestMapping("/all")
	public String allProducts(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "produts";
	}
	
	@RequestMapping("/{category")
	public String getProductByCategory(Model model,	@PathVariable("category") String productCategory) {
		model.addAttribute("products", productService.getProductsByCategory(category));
		return "products";
	}
	
	
}
