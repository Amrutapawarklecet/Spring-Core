package com.spring;

import org.springframework.stereotype.Component;

@Component("eagle")
public class Eagle  implements Bird{

	@Override
	public void fly() {
		System.out.println("I can fly very high");
		
	}

}
