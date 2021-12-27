package com.spring;

import org.springframework.stereotype.Component;

@Component
public class NonVegDiet implements Diet {

	@Override
	public void eat() {
		System.out.println("Red & Juicy Meat");
		
	}

}
