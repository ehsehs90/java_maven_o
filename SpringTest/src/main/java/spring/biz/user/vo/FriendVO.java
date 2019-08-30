package spring.biz.user.vo;

public class FriendVO {
	private String uid;
	private String fid;
	
	public FriendVO() {
		super();
	}

	public FriendVO(String uid, String fid) {
		super();
		this.uid = uid;
		this.fid = fid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	@Override
	public String toString() {
		return "FriendVO [uid=" + uid + ", fid=" + fid + "]";
	}
	
}
