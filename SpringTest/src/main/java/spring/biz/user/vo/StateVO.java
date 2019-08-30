package spring.biz.user.vo;

public class StateVO {
	private String uid;
	private String light;
	private String food;
	private String location;
	
	public StateVO() {
		super();
	}

	public StateVO(String uid, String light, String food, String location) {
		super();
		this.uid = uid;
		this.light = light;
		this.food = food;
		this.location = location;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getLight() {
		return light;
	}

	public void setLight(String light) {
		this.light = light;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "StateVO [uid=" + uid + ", light=" + light + ", food=" + food + ", location=" + location + "]";
	}
	
}
