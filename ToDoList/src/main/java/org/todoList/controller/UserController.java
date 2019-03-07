package org.todoList.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.todoList.domain.UserVO;
import org.todoList.service.UserService;

@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Inject
	private UserService service;
	
	// ù ������ (�α��� ������)
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String userLoginPage() throws Exception{
		
		logger.info("You are connected to the first page of To Do List...");
		
		return "user/user_login";
	}
	
	// ȸ������ ������ �̵�
	@RequestMapping(value = "/joinUS", method = RequestMethod.GET)
	public String userJoinPage() throws Exception{
		
		logger.info("Connected to Join Page...");
		
		return "user/user_join";
	}
	
	// ȸ������ �Ϸ� ��ư
	@RequestMapping(value = "/joinUS", method = RequestMethod.POST)
	public String userJoinSuccess(UserVO vo) throws Exception{
		
		logger.info("Your subscription is complete...");
		logger.info(vo.toString());
		
		service.joinMemerService(vo);
		
		return "redirect:/";
	}
	
	// �α��� ��ư
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String userLoginSuccess(@RequestParam("user_id")String user_id,
			@RequestParam("user_pw")String user_pw) throws Exception{
		
		// id / pw �� �Ѿ������  Ȯ��
		System.out.println("���̵� / �н�����" + user_id + " / " + user_pw);
		
		//
		
		return "toDoList/list_main";
	}
	
}
