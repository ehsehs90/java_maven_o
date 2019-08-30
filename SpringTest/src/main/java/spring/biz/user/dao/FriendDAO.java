package spring.biz.user.dao;

import java.util.List;

import spring.biz.user.vo.FriendVO;

public interface FriendDAO {
	int addFriend(FriendVO f);
	int removeFriend(FriendVO f);
	List<FriendVO> getFriendList(String uid);
}
