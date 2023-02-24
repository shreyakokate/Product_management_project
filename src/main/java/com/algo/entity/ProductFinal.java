package com.algo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductFinal {

	@Id
	private int productid;
	private String name;
	private String productType;
	private String category;
	private double basePrice;
	double discount;
	double gst;
	double delivery;
	double finalprice;

	public ProductFinal() {
		super();
	}
	public ProductFinal(int productid, String name, String productType, String category, double basePrice,
			double discount, double gst, double delivery, double finalprice) {
		super();
		this.productid = productid;
		this.name = name;
		this.productType = productType;
		this.category = category;
		this.basePrice = basePrice;
		this.discount = discount;
		this.gst = gst;
		this.delivery = delivery;
		this.finalprice = finalprice;
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
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public double getDelivery() {
		return delivery;
	}
	public void setDelivery(double delivery) {
		this.delivery = delivery;
	}
	public double getFinalprice() {
		return finalprice;
	}
	public void setFinalprice(double finalprice) {
		this.finalprice = finalprice;
	}

	@Override
	public String toString() {
		return "ProductFinal [productid=" + productid + ", name=" + name + ", productType=" + productType
				+ ", category=" + category + ", basePrice=" + basePrice + ", discount=" + discount + ", gst=" + gst
				+ ", delivery=" + delivery + ", finalprice=" + finalprice + "]";
	}
	
	
	
	
}
