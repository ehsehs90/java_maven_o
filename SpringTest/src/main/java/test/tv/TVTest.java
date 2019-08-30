package test.tv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVTest {

	public static void main(String[] args) {
		String[] config = {"applicationContext.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		
		//TV user = (TV) context.getBean("stv");
		//user.on();
	}

}
