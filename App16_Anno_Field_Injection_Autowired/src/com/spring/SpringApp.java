package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
  
public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
	
	Bird bird=ctx.getBean("vulture",Bird.class);
	bird.eatingStyle();
	ctx.close();
}
}
