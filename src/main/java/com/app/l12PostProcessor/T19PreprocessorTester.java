package com.app.l12PostProcessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.b12PostProcessor.Line;

public class T19PreprocessorTester {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("x12PostProcessor.xml");
		Line line = context.getBean("line", Line.class);
		System.out.println(line);
		
	}
}
