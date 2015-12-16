package com.app.l11SteriotypeAnno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.b11Stereotype.State;

public class T18SteriotypeAnno {
	
	/* Removes Bean Config from XML
	 * @Component - basic annotation for mapping the bean class
	 * @Controller - for Controller in MVC
	 * @Service - for service layer (i.e business layer)
	 * @Repository - for DAO Layer
	 * 
	 * USES
	 * AbstractApplicationContext
	 * */

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("x11steriotypeAnno.xml");
		
		context.registerShutdownHook();
		
		State state = context.getBean("state", State.class);
		System.out.println(state);
		
	}

}
