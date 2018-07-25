package com.packt.webstore.controller;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.packt.webstore.domain.Product;
import com.packt.webstore.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping
	public String list(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "products";
	}

	/*
	 * @RequestMapping("/all") public ModelAndView allProducts() { ModelAndView
	 * modelAndView = new ModelAndView();
	 * 
	 * modelAndView.addObject("products", productService.getAllProducts());
	 * modelAndView.setViewName("products"); return modelAndView; }
	 */

	@RequestMapping("/all")
	public String allProducts(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "products";
	}

	@RequestMapping("/{category}")
	public String getProductsByCategory(@PathVariable("category") String productCategory, Model model) {
		model.addAttribute("products", productService.getProductsByCategory(productCategory));
		return "products";
	}

	@RequestMapping("/filter/{ByCriteria}")
	public String getProductsByFilter(@MatrixVariable(pathVar = "ByCriteria") Map<String, List<String>> filterParams,
			Model model) {
		model.addAttribute("products", productService.getProductsByFilter(filterParams));
		return "products";
	}

	@RequestMapping("/product")
	public String getProductById(@RequestParam("id") String productId, Model model) {
		model.addAttribute("product", productService.getProductById(productId));
		return "product";
	}

	@RequestMapping("/{category}/{price}")
	public String filterProducts(@PathVariable("category") String productCategory,
			@MatrixVariable(pathVar = "price") Map<String, List<String>> priceParams,
			@RequestParam("manufacturer") String manufacturer, Model model) {

		Set<Product> filteredProducts = new HashSet<Product>();

		List<Product> productsByCategory = productService.getProductsByCategory(productCategory);
		List<Product> productsByManufacturer = productService.getProductsByManufacturer(manufacturer);
		Set<Product> productsByPrice = new HashSet<Product>();

		BigDecimal low;
		BigDecimal high;

		low = new BigDecimal(priceParams.get("low").get(0));
		high = new BigDecimal(priceParams.get("high").get(0));

		productsByPrice.addAll(productService.getProductsByPrice(low, high));

		for (Product categoryProduct : productsByCategory) {
			for (Product manufacturerProduct : productsByManufacturer) {
				for (Product priceProduct : productsByPrice) {
					if (priceProduct.equals(manufacturerProduct) && manufacturerProduct.equals(categoryProduct))
						filteredProducts.add(priceProduct);
				}
			}
		}

		model.addAttribute("products", filteredProducts);

		return "products";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String getAddNewProductForm(Model model) {
		Product newProduct = new Product();
		model.addAttribute("newProduct", newProduct);
		return "addProduct";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewProductForm(@ModelAttribute("newProduct") Product productToBeAdded) {
		productService.addProduct(productToBeAdded);
		return "redirect:/products";
	}
}
