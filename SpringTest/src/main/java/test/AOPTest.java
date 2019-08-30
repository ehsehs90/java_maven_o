package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {

	public static void main(String[] args) {
		String[] config = { "applicationContext.xml" };
		ApplicationContext context = new ClassPathXmlApplicationContext(config);

		CutClass cut = (CutClass) context.getBean("cutclass");
		cut.cutOut();
	}

}
