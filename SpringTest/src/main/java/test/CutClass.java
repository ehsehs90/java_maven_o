package test;

import org.springframework.stereotype.Component;

@Component("cutclass")
public class CutClass {
	
	public String cutOut() {
		System.out.println("point-cut");
		return "success";
	}
}
