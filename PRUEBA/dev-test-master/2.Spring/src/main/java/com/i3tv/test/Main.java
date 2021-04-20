/**
 * 
 */
package com.i3tv.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	/**
	 * Corrige los errores de ejecución sin usar anotaciones.
	 * @param args
	 */
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		BeanExample instance = context.getBean(BeanExample.class);
		System.out.println(instance.getProperty());
		context.close();
	}
}