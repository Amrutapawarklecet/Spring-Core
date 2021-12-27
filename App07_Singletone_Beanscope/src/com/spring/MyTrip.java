package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTrip {
    public static void main(String[] args) {
		 //load configuration path
    	
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
    	
    	//retrive 
    	Car car1=ctx.getBean("myCar",Car.class);
    	Car car2=ctx.getBean("myCar" ,Car.class);
    	  
    	
    	//if it return true means it is singleton beanscope
    	System.out.println(car1==car2);
    	
    	ctx.close();
    	
    	
    	/*A a1=new A();
    	A a2=new A();
    	A a3=a1;
    	System.out.println(a1==a2); //false
    	System.out.println(a1==a3); //true
    	*/
	}
}
