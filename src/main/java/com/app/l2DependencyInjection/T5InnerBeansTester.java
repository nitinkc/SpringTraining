package com.app.l2DependencyInjection;

import beans.b2DIBeans.B3Line;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class T5InnerBeansTester {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"b1ApplnContextTest.xml");
		
		// This invokes the Point class objects being used in the Line Class
		B3Line line=(B3Line)context.getBean("lineInnerBean");
				
		line.draw();
	}

}
