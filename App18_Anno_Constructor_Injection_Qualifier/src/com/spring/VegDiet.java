package com.spring;

import org.springframework.stereotype.Component;

@Component
public class VegDiet  implements Diet{

	@Override
	public void eat() {
		System.out.println("Grains,Fruits & Veg");
		
	}

}
