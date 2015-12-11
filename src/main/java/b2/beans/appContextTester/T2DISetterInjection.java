package b2.beans.appContextTester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class T2DISetterInjection {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"b1ApplnContextTest.xml");

		// Demonstration of Setting values through beans->property, value tag
		// "fruitSetterInjection" will invoke the setters of the Fruit class
		B1Fruit fruit = (B1Fruit) context.getBean("fruitSetterInjection"); 

		/* The following will do the same thing as
		 * fruit.setName("Grapes"); fruit.setSeason("Winter);
		 */
		fruit.fruitTest();
	}

}
