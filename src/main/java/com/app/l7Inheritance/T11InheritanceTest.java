package com.app.l7Inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.b7Inheritance.Customer;

public class T11InheritanceTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("b1ApplnContextTest.xml");
		
		// Calling the Child Customer bean (Will have the one property of the Parent)
		Customer c = (Customer) context.getBean("childCustomerBean");
		
		// The Country is set India in the Parent Class and is overridden to USA in the Child Class
		System.out.println(c);
	}
}