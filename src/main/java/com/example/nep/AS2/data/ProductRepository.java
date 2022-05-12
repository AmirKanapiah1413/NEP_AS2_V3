package com.example.nep.AS2.data;



import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.example.nep.AS2.model.Product;

@Component
public class ProductRepository {
private static final ArrayList <Product> ALL_PRODUCTS = new ArrayList <Product> (Arrays.asList(
		new Product("Acer Aspire 5 Laptop","acer.jpg",1,499.99,true),
		new Product("ASUS ROG Strix G15 Laptop","asus.jpg",2,1899.99,true),
		new Product("Dell Alienware Area 51M Laptop","dell.jpg",3,2499.99,true),
		new Product("MSI GL62M 7REX","msi.jpg",4,1199.00,true)
		)
		);


public Product findbyName(String name) {
	for (Product product : ALL_PRODUCTS) {
		if(product.getProductName().equals(name)) {
			return product;
		}
	
		
	}
	return null;
}

public Product findbyID(int id) {
	for (Product product : ALL_PRODUCTS) {
		if(product.getProductID()==id) {
			return product;
		}
	
		
	}
	return null;
}

public ArrayList<Product> getAllProducts(){
	return ALL_PRODUCTS;
}

public void add (Product product) {
	ALL_PRODUCTS.add(product);
}

public void delete(int id) {
	Product product = findbyID(id);
	ALL_PRODUCTS.remove(product);
}

}