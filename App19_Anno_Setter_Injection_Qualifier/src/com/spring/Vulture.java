package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vulture  implements Bird{
 //dependency
	Diet diet;

	//Setter
	@Autowired
	@Qualifier("vegDiet")
	public void setDiet(Diet diet) {
		this.diet = diet;
	}
	@Override
	public void eatingStyle() {
		diet.eat();
		
	}

}