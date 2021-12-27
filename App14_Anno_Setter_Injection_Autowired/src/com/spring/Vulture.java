package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vulture  implements Bird{
 //dependency
	Diet diet;
	
	//setter
	@Autowired
	public void setDiet(Diet diet) {
		this.diet = diet;
	}
	
	
	
	
	@Override
	public void eatingStyle() {
		diet.eat();
		
	}

}
