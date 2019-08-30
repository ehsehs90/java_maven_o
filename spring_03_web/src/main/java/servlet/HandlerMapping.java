package servlet;

import java.util.HashMap;

public class HandlerMapping {
	HashMap<String, Controller> map = new HashMap<String, Controller>();

	public HandlerMapping() {
		map.put("/list.do", new ListController());
		map.put("/home.do", new HomeController());
		map.put("/login.do", new LoginController());
	}
	
	public Controller getController(String path) {
		return map.get(path);
	}
}
