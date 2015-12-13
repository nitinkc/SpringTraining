package com.app.l2DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.b2DIBeans.B5DateBean;

public class T3DateInjection {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"b1ApplnContextTest.xml"});
		
		B5DateBean date = (B5DateBean)context.getBean("dateTest");
		
		date.toString();
	}
}
