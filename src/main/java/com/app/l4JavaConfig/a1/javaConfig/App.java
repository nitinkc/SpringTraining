package com.app.l4JavaConfig.a1.javaConfig;

import config.a1.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

// Importing local packages
import beans.b4javaConfigBeans.javaConfig.implementation.HelloWorld;

@Configuration
public class App {
    public static void main( String[] args ) {

        // ClassPathXmlApplicationContext Picks up XML from the resource folder
        // ApplicationContext context = new ClassPathXmlApplicationContext("a1Spring.xml");

        // Loads the configuration settings from the class instead of an XML
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld obj = (HelloWorld) context.getBean("helloBean");

        obj.greetings(" Nitin");

    }
}
