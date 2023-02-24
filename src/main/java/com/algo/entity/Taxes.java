package com.algo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Taxes {

	
	String category;
	double discount;
	double GST;
	double deliverycharge;

	public Taxes() {
		super();
	}
	
	public Taxes(String category, double discount, double gST, double deliverycharge) {
		super();
		this.category = category;
		this.discount = discount;
		GST = gST;
		this.deliverycharge = deliverycharge;
	}
	
	@Id
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getGST() {
		return GST;
	}
	public void setGST(double gST) {
		GST = gST;
	}
	public double getDeliverycharge() {
		return deliverycharge;
	}
	public void setDeliverycharge(double deliverycharge) {
		this.deliverycharge = deliverycharge;
	}
	@Override
	public String toString() {
		return "Taxes [category=" + category + ", discount=" + discount + ", GST=" + GST + ", deliverycharge="
				+ deliverycharge + "]";
	}
	
	
	
	
}
