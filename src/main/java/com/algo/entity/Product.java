package com.algo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	private int productid;
	private String name;
	private String productType;
	private String category;
	private double basePrice;
	

	public Product() {
		super();
	}
	public Product(int productid, String name, String productType, String category, double basePrice) {
		super();
		this.productid = productid;
		this.name = name;
		this.productType = productType;
		this.category = category;
		this.basePrice = basePrice;
	}

	@Id
	public int getProductid() {
		return productid;
	}


	public void setProductid(int productid) {
		this.productid = productid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getProductType() {
		return productType;
	}


	public void setProductType(String productType) {
		this.productType = productType;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public double getBasePrice() {
		return basePrice;
	}


	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}	
	
}
