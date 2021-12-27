package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("BeanLifeCycleApplicationContext.xml");
		ctx.getBean("testBean",TestBean.class);
		ctx.close();
	}

}
