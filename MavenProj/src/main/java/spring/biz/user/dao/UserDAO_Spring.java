package spring.biz.user.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import spring.biz.user.vo.UserVO;

@Repository("spring")
public class UserDAO_Spring implements UserDAO{
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public UserVO login(String id, String pw) {
		return null;
	}

	@Override
	public UserVO getUser(String id) {
		return null;
	}

	@Override
	public int addUser(UserVO vo) {
		String sql = "insert into userinfo (id, pw) values(?, ?)";
		return template.update(sql, vo.getId(), vo.getPw());
	}

	@Override
	public List<UserVO> getUserList() {
		return null;
	}

	@Override
	public int update(UserVO vo) {
		return 0;
	}

}
