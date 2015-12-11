package b2.beans.appContextTester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class T1ApplicationContextTester {

	public static void main(String[] args) {
		
		// ClassPathXmlApplicationContext Picks up XML from the resource folder
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"b1ApplnContextTest.xml");
		
		// Initialized with the default Constructor
		B1Fruit fruit = (B1Fruit) context.getBean("fruit");

		fruit.fruitTest();
	}
}
