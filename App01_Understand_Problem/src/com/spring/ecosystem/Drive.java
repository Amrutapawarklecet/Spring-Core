package com.spring.ecosystem;

public class Drive {

	public static void main(String[] args) {
		Tyre t=new Tyre();
		
		Car c=new Car();
            //Inject the dependency
		c.setT(t);
		
		c.letsGo();
	}

}
