package com.spring;

public class Car {
	//Dependency injection
private Tyre t;


//Provide setter for injection
	public void setT(Tyre t) {
		this.t = t;
	}
	
    public void letsGo() {
    	System.out.println("We are going to Mysore");
    	System.out.println(t.move());
    }

	
	
}
