package spring.biz.user.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import spring.biz.user.vo.UserVO;

@Repository("mybatis")
public class UserDAO_MyBatis implements UserDAO{

	@Autowired
	SqlSession sqlSession = null;
    
//    @Autowired
//	public void setSqlSession(SqlSession sqlSession) {
//		this.sqlSession = sqlSession;
//	}
    
    public SqlSession getSqlSession() {
    	return sqlSession;
    }
    
    @Override
    public UserVO login(String id, String pw){
        UserVO vo = new UserVO();
        vo.setId(id);
        vo.setPw(pw);
        return sqlSession.selectOne("user.login", vo);
    }
    
    @Override
    public UserVO getUser(String id){
        return sqlSession.selectOne("user.getuser", id);
    }
    
    @Override
    public int addUser(UserVO vo){
        return sqlSession.insert("user.adduser", vo);
    }
   
    @Override
	public List<UserVO> getUserList(){
        return sqlSession.selectList("user.list");
    }
    
    @Override
    public int update(UserVO vo){
        return sqlSession.update("user.update", vo);
    }
}
