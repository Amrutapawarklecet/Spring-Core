package com.spring.java.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
		Car c=ctx.getBean("car",Car.class);
		c.drive();
		ctx.close();
	}

}