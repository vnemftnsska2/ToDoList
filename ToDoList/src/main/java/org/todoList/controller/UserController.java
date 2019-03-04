package org.todoList.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.todoList.domain.UserVO;

@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
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
	public String userJoinSuccess(UserVO userVO) throws Exception{
		
		logger.info("Your subscription is complete...");
		
		return "redirect:/user/user_login";
	}
	
}