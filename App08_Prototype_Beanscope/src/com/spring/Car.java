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
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
    void letsGo() {
   
		System.out.println("We are going to Mysore");
		System.out.println(t.move());
	}
}
