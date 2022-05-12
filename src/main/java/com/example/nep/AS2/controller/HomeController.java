package com.example.nep.AS2.controller;



import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.nep.AS2.model.Product;



@Controller
public class HomeController {
	
	@RequestMapping(value="/")
	public String home() {
	return "index";
	}

	@RequestMapping(value="/product")
	public String product(ModelMap modelMap) {
		ArrayList<Product> productList = new ArrayList<>();
		Product product= new Product("Acer Aspire 5 Laptop","/images/product/acer.jpg",499.99,true);
		Product product1= new Product("ASUS ROG Strix G15 Laptop","/images/product/asus.jpg",1899.99,true);
		Product product2= new Product("Dell Alienware Area 51M Laptop","/images/product/dell.jpg",2499.99,true);
		Product product3= new Product("MSI GL62M 7REX","/images/product/msi.jpg",1199.00,true);
		productList.add(product);
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		modelMap.put("product", product);
	return "product";
	}
	
	@RequestMapping(value="/register_product")
	public String register_product() {
	return "register_product";
	}

	@RequestMapping(value="/search")
	public String search() {
	return "search";
	}
	
	@RequestMapping(value="/support")
	public String support() {
	return "support";
	}
	
}
