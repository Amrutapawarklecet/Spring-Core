package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//TestBean t=ctx.getBean("testBean",TestBean.class);
		  TBean t=ctx.getBean("TBean",TBean.class);
		ctx.close();
	

}
}
