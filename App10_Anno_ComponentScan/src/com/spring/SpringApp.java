package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Eagle e=ctx.getBean("eagle",Eagle.class);
		e.fly();
		ctx.close();
	}

}
