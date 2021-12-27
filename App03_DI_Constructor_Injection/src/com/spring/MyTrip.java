package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTrip {
    public static void main(String[] args) {
		 //load configuration path
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
    	
    	//retrive 
    	Car c=ctx.getBean("myCar",Car.class);
    	 c.letGo();
    	 
    	 //close context
    	 ctx.close();
    	
    	
    	
	}
}
