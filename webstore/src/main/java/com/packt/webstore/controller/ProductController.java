package com.packt.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.packt.webstore.service.impl.ProductServiceImpl;

@Controller
public class ProductController {
	@Autowired
	private ProductServiceImpl productServiceImpl;

	@RequestMapping("/all")
	public String list(Model model) {
		model.addAttribute("products", productServiceImpl.getAllProducts());
		return "products";
	}
	
	@RequestMapping("/{category}")
	public String getProductsByCategory(Model model, @PathVariable("category") String productCategory) {
		model.addAttribute("Products", productServiceImpl.getProductByCategory(productCategory));
		return  "products";
	}

	@RequestMapping("/filter/{ByCriteria}")
	public String getProductByFilter(@MatrixVarianle(PathVar="ByCriteria") Map<String, List<String>> filterParams, Model model) {
		model.addAttribute("products", productServiceImpl.getProductByFilter(filterParams));
		return "product";		
	}
	
}