package com.app.l5AutoWiring;

import beans.b5autowiringBeans.C2Line;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class T3ByType {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"b2autoWiringTest.xml");
		
		C2Line line = (C2Line) context.getBean("line2");
		line.draw();
	}
}
