package com.example.nep.AS2.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.nep.AS2.data.Repository;
import com.example.nep.AS2.model.Product;




@Controller
public class HomeController {
	
	@Autowired
	private Repository repos;
	
	@RequestMapping(value="/")
	public String home() {
	return "index";
	}

	@RequestMapping(value="/product")
	public String product(ModelMap modelMap) {
		List<Product> p = repos.getAllProducts();
		modelMap.put("productList", p);
		
		
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
