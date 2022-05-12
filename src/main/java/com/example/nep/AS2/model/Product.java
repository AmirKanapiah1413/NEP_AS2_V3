package com.example.nep.AS2.model;

public class Product {
	
private String productName;
private String productPath;
private int productID;
private double productPrice;
private boolean productStock;

public Product(String productName, String productPath,int productID, double productPrice, boolean productStock) {
	this.productName = productName;
	this.productPrice = productPrice;
	this.productPath = productPath;
	this.productStock = productStock;
	this.productID = productID;
}

public int getProductID() {
	return productID;
}

public void setProductID(int productID) {
	this.productID = productID;
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
