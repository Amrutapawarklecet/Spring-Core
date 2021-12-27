package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vulture  implements Bird{
 //dependency
	Diet diet;

	//Constructor
	public Vulture(@Qualifier("vegDiet")Diet diet) {
		this.diet=diet;
	}
	@Override
	public void eatingStyle() {
		diet.eat();
		
	}

}
