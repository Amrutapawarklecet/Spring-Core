package com.spring.ecosystem;

public class Car {
	private Tyre t;
	
	public void setT(Tyre t) {
		this.t = t;
	}
	
    void letsGo() {
   
		System.out.println("We are going to Mysore");
		System.out.println(t.move());
	}
}

