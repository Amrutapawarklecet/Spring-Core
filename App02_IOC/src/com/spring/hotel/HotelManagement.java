package com.spring.hotel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HotelManagement {

	public static void main(String[] args) {
		  //load the configuration xml file
		ClassPathXmlApplicationContext ctx =new ClassPathXmlApplicationContext("spring.xml");
		
		//retrive the bean from controller
		Chef chef=ctx.getBean("iChef",Chef.class);
		
		//call method
		 System.out.println(chef.preparedFood());
		
		//close the context
           ctx.close();
	}

}
