package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller /*1. 이 Class를 Controller선언*/
public class HelloController {
	
	@RequestMapping("/hello.do")/*hello.do가 들어왔을 때 이 메소드를 호출*/
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "hello Spring MVC~~~");
		mav.setViewName("hello");
		return mav; /*이름이 hello인 mav를 리턴, resolver에 의해 /WEB-INF/view/hello.jsp로 변활될 것.*/
	}
}
