package com.example.nep.AS2.model;

public class Product {
private String productName;
private String productPath;
private double productPrice;
private boolean productStock;

public Product(String productName, String productPath, double productPrice, boolean productStock) {
	this.productName = productName;
	this.productPrice = productPrice;
	this.productPath = productPath;
	this.productStock = productStock;
}

public String getProductPath() {
	return productPath;
}

public void setProductPath(String productPath) {
	this.productPath = productPath;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public double getProductPrice() {
	return productPrice;
}

public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
}

public boolean isProductStock() {
	return productStock;
}

public void setProductStock(boolean productStock) {
	this.productStock = productStock;
}


}
