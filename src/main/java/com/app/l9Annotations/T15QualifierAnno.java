package com.app.l9Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.b9Annotation.Triangle;

public class T15QualifierAnno {
	/* Autowired Annotation go for "byType" first, if there are multiple beans
	 * of same type then it goes byName*/
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"x9QualifierAnno.xml");

		Triangle t = (Triangle) context.getBean("nitin");
		System.out.println(t);
		
		/* Example of Alias*/
		Triangle t2 = (Triangle) context.getBean("triangle-alias");
		System.out.println(t2);
	}
}
