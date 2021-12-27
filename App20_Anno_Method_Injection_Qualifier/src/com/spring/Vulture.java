package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vulture  implements Bird{
 //dependency
	Diet diet;

	//Method here is no requried setter method we can create our own method
		@Autowired
		@Qualifier("vegDiet")
		public void setMyPartyCuisinet(Diet diet) {
			this.diet = diet;
		}
	
	@Override
	public void eatingStyle() {
		diet.eat();
		
	}

}
