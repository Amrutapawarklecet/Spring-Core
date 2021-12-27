package com.spring;

import org.springframework.stereotype.Component;

@Component("testBean")
public class TestBean {
   public TestBean() {
	System.out.println("Dc-TestBean");
}
}
