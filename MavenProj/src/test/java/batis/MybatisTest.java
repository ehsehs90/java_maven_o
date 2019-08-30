package batis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.TestCase;
import spring.biz.user.dao.UserDAO;
import spring.biz.user.service.UserService;
import spring.biz.user.vo.UserVO;


//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MybatisTest extends TestCase {
	
//	@Autowired
//	UserService service;
	
	@Test
	public void test() {
		String[] config = {"applicationContext.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		UserDAO dao = (UserDAO) context.getBean("mybatis");
//		UserService service = (UserService) context.getBean("service");
		
		UserVO vo = new UserVO();
		vo.setId("mm");
		vo.setPw("78");
		System.out.println(dao.addUser(vo));
	}
}
