package com.packt.webstore.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
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
		model.addAttribute("Products", productServiceImpl.getProductsByCategory(productCategory));
		return  "products";
	}

	@RequestMapping("/filter/{ByCriteria}")
	public String getProductByFilter(@MatrixVariable(pathVar="ByCriteria") Map<String, List<String> > filterParams, Model model) {
		model.addAttribute("products", productServiceImpl.getProductsByFilter(filterParams));
		return "product";		
	}
	
}