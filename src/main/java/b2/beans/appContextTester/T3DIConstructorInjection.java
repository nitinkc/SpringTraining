package b2.beans.appContextTester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class T3DIConstructorInjection {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"b1ApplnContextTest.xml");

		// Demonstration of Setting values through beans->constructor-arg value,index,type tag
		// "fruitConstructorInjection" will invoke the constructor of the Fruit class
		B1Fruit fruit = (B1Fruit) context.getBean("fruitConstructorInjection");
		
		/* The following will do the same thing as
		 * B1Fruit fruit = new B1Fruit("Kiwi", "Winter");
		 */
		fruit.fruitTest();
	}

}
