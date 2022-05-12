package com.example.nep.AS2.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.nep.AS2.model.Product;

@Component
public class Repository {
private static final List <Product> ALL_PRODUCTS = Arrays.asList(
		new Product("Acer Aspire 5 Laptop","acer.jpg",499.99,true),
		new Product("ASUS ROG Strix G15 Laptop","asus.jpg",1899.99,true),
		new Product("Dell Alienware Area 51M Laptop","dell.jpg",2499.99,true),
		new Product("MSI GL62M 7REX","msi.jpg",1199.00,true)
		);


public Product findbyName(String name) {
	for (Product product : ALL_PRODUCTS) {
		if(product.getProductName().equals(name)) {
			return product;
		}
	
		
	}
	return null;
}
public List<Product> getAllProducts(){
	return ALL_PRODUCTS;
}
}
