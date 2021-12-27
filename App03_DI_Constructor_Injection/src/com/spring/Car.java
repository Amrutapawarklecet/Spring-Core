package com.spring;

public class Car {
	//Dependency injection
 private Tyre t;

//Provide Constructor for injection
	public Car(Tyre t) {
		super();
		this.t=t;
	}
	
	public void letGo() {
		System.out.println("We are going to Mysore");
		System.out.println(t.move());
	}
	}

