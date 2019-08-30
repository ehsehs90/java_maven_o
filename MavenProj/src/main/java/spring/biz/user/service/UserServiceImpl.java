package spring.biz.user.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import spring.biz.user.dao.UserDAO;
import spring.biz.user.vo.UserVO;

@Service("service")
public class UserServiceImpl implements UserService{

	@Resource(name="mybatis")
	private UserDAO dao;
	
	@Override
	public int addUser(UserVO vo) {
		return dao.addUser(vo);
	}

}
