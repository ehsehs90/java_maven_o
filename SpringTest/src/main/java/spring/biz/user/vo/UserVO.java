package spring.biz.user.vo;

public class UserVO {
	private String uid;
	private String upw;
	private String uname;
	private int age;
	private String gender;

	public UserVO() {
		super();
	}

	public UserVO(String uid, String upw, String uname, int age, String gender) {
		super();
		this.uid = uid;
		this.upw = upw;
		this.uname = uname;
		this.age = age;
		this.gender = gender;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUpw() {
		return upw;
	}

	public void setUpw(String upw) {
		this.upw = upw;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "UserVO [uid=" + uid + ", upw=" + upw + ", uname=" + uname + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
