package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vulture  implements Bird{
 //dependency
	//field 
   // @Qualifier("vegDiet")
	@Qualifier("nonVegDiet")
	@Autowired
	Diet diet;

	
	@Override
	public void eatingStyle() {
		diet.eat();
		
	}

}
