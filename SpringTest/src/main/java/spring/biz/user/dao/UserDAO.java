package spring.biz.user.dao;

import spring.biz.user.vo.UserVO;

public interface UserDAO {
	int addUser(UserVO user);
	int removeUser(String userid);
	UserVO getUser(String userid);
	UserVO login(String userid, String userpw);
}
