package com.i3tv.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceExample {
	
	@Autowired
	private BeanExample beanExample;
	
	public String print() {
		return beanExample.getProperty();
	}
}
