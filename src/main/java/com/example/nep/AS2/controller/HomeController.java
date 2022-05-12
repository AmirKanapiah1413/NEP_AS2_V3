package com.example.nep.AS2.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.nep.AS2.data.ProductRepository;
import com.example.nep.AS2.model.Product;




@Controller
public class HomeController {
	
	@Autowired
	private ProductRepository repos;
	
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
	
	@RequestMapping(value="/add/product")
	public String addNewStudent(
			@RequestParam(required=true) int id,
			@RequestParam(required=true) String name,
			@RequestParam(required=true) double price,
			@RequestParam(required=true) String file,
			@RequestParam(required=true) boolean available
			) {
		Product product = new Product(name,file,id,price,available);
		repos.add(product);
		
			return "redirect:/";
	}
	@RequestMapping(value="/edit_product/{productID}")
	public String editProduct(@PathVariable int productID,ModelMap modelMap) {
		Product product = repos.findbyID(productID);
		if (product!=null) {
			modelMap.put("product",product);
			return "edit_product";
		}else {
			return "redirect:/product";
		}
		
	}
	@RequestMapping(value="/edit/product/{id}")
	public String edit(
			@PathVariable int id,
			@RequestParam(required=true) String name,
			@RequestParam(required=true) double price,
			@RequestParam(required=true) String file,
			@RequestParam(required=false) String available
			) {
		Product product = repos.findbyID(id);
		boolean stock = false;
		if (available.equals("true")) {
			stock=true;
		}else {
			stock=false;
		}
		product.setProductID(id);
		product.setProductName(name);
		product.setProductPath(file);
		product.setProductPrice(price);
		product.setProductStock(stock);
		return "redirect:/edit_product"+id;
	}
	
	@RequestMapping(value="/delete_product/{productID}")
	public String deleteProduct(@PathVariable int productID) {
		repos.delete(productID);
		return "redirect:/product";
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
