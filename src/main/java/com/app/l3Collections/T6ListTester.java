package com.app.l3Collections;

import beans.b2DIBeans.B4Rectangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class T6ListTester {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"b1ApplnContextTest.xml");
		B4Rectangle rectangle=(B4Rectangle)context.getBean("rectangle");
			
		rectangle.draw();
	}

}
