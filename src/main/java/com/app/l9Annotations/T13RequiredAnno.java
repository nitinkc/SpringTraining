package com.app.l9Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.b9Annotation.Circle;

public class T13RequiredAnno {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("b1ApplnContextTest.xml");
		
		Circle c = (Circle)context.getBean("circle");
		System.out.println(c);
		
		
	}

}
