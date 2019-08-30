package spring.biz.user.dao;

import java.util.List;

import spring.biz.user.vo.UserVO;

public interface UserDAO {
	public UserVO login(String id, String pw);
    
    public UserVO getUser(String id);
    
    public int addUser(UserVO vo);
   
	public List<UserVO> getUserList();
    
    public int update(UserVO vo);
}
