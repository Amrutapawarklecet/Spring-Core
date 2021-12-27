//It is like xml file
package com.spring.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.java")
public class SpringConfig {
 
	@Bean
	public Tyre mrf() {
		return new Mrf();
	}
	@Bean
	public Car car() {
		return new Creta(mrf());
	}
	
}
