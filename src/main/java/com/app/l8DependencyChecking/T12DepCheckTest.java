package com.app.l8DependencyChecking;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.b8dependencyChecking.Employee;

public class T12DepCheckTest {

	/* 4 Dependency Checking Modes
	 * 1. none
	 * 2. simple - if properties of primitives and collection are not set, UnsatisfiedDependencyException
	 * 3. objects - if any properties of object type have not been saved
	 * 4. all - for any properties of any type
	 * 
	 * Is also acquired by @Required. To Register RequiredAnnotationBeanPostProcessor, two ways
	 * 1. Add Spring Context and <context:annotation-config/> in bean config file
	 * 2. Include "RequiredAmmotationBeanPostProcessor" directly in the bean post prosessor file
	 * */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("b3DepCheck.xml");
		
		Employee e = (Employee)context.getBean("depEmployee");
		System.out.println(e);
	}
}