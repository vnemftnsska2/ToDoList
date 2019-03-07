package org.todoList.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.todoList.domain.LoginDTO;
import org.todoList.domain.UserVO;
import org.todoList.service.UserService;

@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Inject
	private UserService service;
	
	// 첫 페이지 (로그인 페이지)
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String userLoginPage() throws Exception{
		
		logger.info("You are connected to the first page of To Do List...");
		
		return "user/user_login";
	}
	
	// 회원가입 페이지 이동
	@RequestMapping(value = "/joinUS", method = RequestMethod.GET)
	public String userJoinPage() throws Exception{
		
		logger.info("Connected to Join Page...");
		
		return "user/user_join";
	}
	
	// 회원가입 완료 버튼
	@RequestMapping(value = "/joinUS", method = RequestMethod.POST)
	public String userJoinSuccess(UserVO vo) throws Exception{
		
		logger.info("Your subscription is complete...");
		logger.info(vo.toString());
		
		service.joinMemerService(vo);
		
		return "redirect:/";
	}
	
	// 로그인 버튼
	@RequestMapping(value = "/MainPage", method = RequestMethod.POST)
	public String userLoginSuccess(LoginDTO dto) throws Exception{
		
		// id / pw 값 넘어오는지  확인
		System.out.println("아이디 / 패스워드 : " + dto.getUser_id() + " / " + dto.getUser_pw());
		
		// 1. Service 클래스로 넘겨서 유효성 검사할 예정
		// 2. 쿠키 검사를 위해(화면에서 전달되는 데이터 전송 받기 위해) DTD 설계
		service.userLoginService(dto);
		
		// 3. 만약 유효성 검사 결과가 일치하지 않는다면,
		// HttpServletResponse 객체를 이용해 화면에 경고 띄워줌.
		
		return "toDoList/list_main";
	}
	
}
