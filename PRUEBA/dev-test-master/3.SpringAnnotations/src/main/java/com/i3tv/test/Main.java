package com.i3tv.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		ServiceExample service = context.getBean(ServiceExample.class);
		System.out.println(service.print());
		context.close();
	}
}