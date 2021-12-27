package com.spring.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.java.config.SpringConfig;

public class Demo {

	public static void main(String[] args) {
		 
   AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(SpringConfig.class);
   MyBean mb=ctx.getBean("myBean" , MyBean.class);
   mb.test();
   ctx.close();
	
	}

}
