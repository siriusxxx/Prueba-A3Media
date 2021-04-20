package com.i3tv.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:base.properties")
public class BeanExample {
	
	@Value("${base.property}")
	private String property;

	public String getProperty() {
		return property;
	}
	
	public void setProperty(String property) {
		this.property = property;
	}

}
