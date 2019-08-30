package web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.biz.user.service.UserService;
import spring.biz.user.vo.UserVO;
import web.validator.UserValidator;

@Controller
public class UserController {

	@Autowired
	UserService service;
	
	@RequestMapping("/user/list.do")
	public ModelAndView getUserList(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		HttpSession session = request.getSession();
		mav.setViewName("user/user_list");
		mav.addObject("users", service.getUserList());
		return mav;
	}
	
	@RequestMapping(value = "/user/add.do", method = RequestMethod.GET)
	public String addUser() {
		return "user/user_write";
	}
	
	@RequestMapping(value = "/user/add.do", method = RequestMethod.POST)
	public String addUserProc(@ModelAttribute("user") UserVO vo, HttpServletRequest request, BindingResult errors) {
		/*UserVO를 command객체라 부른다, vo의 set메소드와 form입력창의 name이 같으면 동적바인딩이 이루어진다.*/
		
		new UserValidator().validate(vo, errors);
		
		if(errors.hasErrors()) {
			return "user/user_write";
		}
		
		int row = 0;
		row = service.addUser(vo);
		/*list.do를 리턴하면 list.do.jsp를 호출하므로 에러가 발생한다. 
		 * 따라서 list.do를 리다이렉트 한다.*/
		return "redirect:/user/list.do";
	}
	
	@RequestMapping("/user/view.do")
	public ModelAndView getView(@RequestParam("userid") String id) {
		/*parameter 이름이 그냥 id이면 전달받지 못함. userid이어야 받을 수 있음*/
		/*@RequestParam을 이용하여 바인딩 할 수 도 있음*/
		ModelAndView mav = new ModelAndView();
		mav.addObject("user", service.getUser(id));
		mav.setViewName("user/user_view");
		return mav;
	}
	
	@RequestMapping("/user/remove.do")
	public String remove(String userid) {
		System.out.println(userid);
		service.removeUser(userid);
		return "redirect:/user/list.do";
	}
	
	@RequestMapping("/user/modify.do")
	public ModelAndView modify(String userid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("user", service.getUser(userid));
		mav.setViewName("user/user_modify");
		return mav;
	}
	
	@RequestMapping("/user/update.do")
//	public ModelAndView update(@ModelAttribute("user") UserVO user) {
	/*@ModelAttribute를 통해 이동하는 페이지에서 user사용할 수 있도록 함*/
	public ModelAndView update(UserVO user) {
		ModelAndView mav = new ModelAndView();
		service.updateUser(user);
		mav.addObject("user", service.getUser(user.getUserid()));
		/*다만 @ModelAttribute보다 위와 같이 addObject를 사용하는 것이 바람직함*/
		mav.setViewName("user/user_view");
		return mav;
	}
	
	@RequestMapping("/user/search.do")
	public ModelAndView search(String searchCondition, String searchKeyword) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("users", service.searchUser(searchCondition, searchKeyword));
		mav.setViewName("user/user_list");
		return mav;
	}
	
	@ExceptionHandler(Exception.class)
	public String Ex(Exception exception, Model model) {
		model.addAttribute("exception", exception);
		return "error";
	}
	
}
