package com.spring;

public class Car {
	//Dependency injection
	private Tyre t;
	private String brand;
	private String model;

//Provide setter for injection
   
	public void setT(Tyre t) {
		this.t = t;
	}
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public void letsGo() {
		System.out.println("We are going to mysore");
		System.out.println(t.move());
	}
	
}
