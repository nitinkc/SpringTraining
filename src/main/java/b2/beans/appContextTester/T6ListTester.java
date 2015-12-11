package b2.beans.appContextTester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class T6ListTester {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"b1ApplnContextTest.xml");
		B4Rectangle rectangle=(B4Rectangle)context.getBean("rectangle");
			
		rectangle.draw();
	}

}
