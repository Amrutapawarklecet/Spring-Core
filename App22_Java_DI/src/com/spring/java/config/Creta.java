package com.spring.java.config;




public class Creta implements Car {

	Tyre t;
	
	
	public Creta(Tyre t) {
		this.t=t;
	}


	@Override
	public void drive() {
		t.rotate();
		
	}

}
