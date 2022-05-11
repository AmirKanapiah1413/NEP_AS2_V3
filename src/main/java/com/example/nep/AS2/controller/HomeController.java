package com.example.nep.AS2.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController {
	
	@RequestMapping(value="/")
	public String home() {
	return "index";
	}
	@RequestMapping(value="/index.html")
	public String home2() {
	return "index";
	}	

	@RequestMapping(value="/product.html")
	public String product() {
	return "product";
	}
	
	@RequestMapping(value="/register_product.html")
	public String register_product() {
	return "register_product";
	}

	@RequestMapping(value="/search.html")
	public String search() {
	return "search";
	}
	
	@RequestMapping(value="/support.html")
	public String support() {
	return "support";
	}
}
