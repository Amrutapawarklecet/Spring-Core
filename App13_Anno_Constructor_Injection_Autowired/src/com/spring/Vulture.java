package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vulture  implements Bird{
 //dependency
	Diet diet;
	
	//constructor 
	//@Autowired
	//4.3 version by default is autowired
	public Vulture(Diet diet) {
	  this.diet=diet;
	
	}
	
	
	@Override
	public void eatingStyle() {
		diet.eat();
		
	}

}
