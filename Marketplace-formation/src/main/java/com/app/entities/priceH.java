package com.app.entities;

import java.io.Serializable;
import java.util.Date;

public class priceH implements Serializable {

	private double price;
	private Date Date_P;
	public priceH() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getDate_P() {
		return Date_P;
	}
	public void setDate_P(Date date_P) {
		Date_P = date_P;
	}
	
	
	
}
