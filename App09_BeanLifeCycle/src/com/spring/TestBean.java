package com.spring;

public class TestBean {
	public TestBean() {
		System.out.println("Dc-TestBean");
	}
	
	public void myInitMethod() {
		 System.out.println("Init-TestBean");
	}
	public void myDestroyMethod() {
		 System.out.println("Destroy-TestBean");
	}
}
