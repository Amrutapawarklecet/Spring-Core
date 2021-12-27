package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTrip {
    public static void main(String[] args) {
		 //load configuration path
    	
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
    	
    	//retrive 
    	Car car1=ctx.getBean("myCar",Car.class);
    	Car car2=ctx.getBean("myCar",Car.class);
        System.out.println(car1==car2);
    
    	
    	ctx.close();
    	
    	
    	
    	
	}
}
