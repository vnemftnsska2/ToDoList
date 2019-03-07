package org.todoList.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/main")
public class MainController {

	private static final Logger logger =LoggerFactory.getLogger(MainController.class);
	
	// MainPage ¿Ãµø
	@RequestMapping(value = "/todoList", method = RequestMethod.GET)
	public String toDoListPage() {
		
		logger.info("Main Page Connected...");
		
		return "toDoList/list_main";
	}
	
}
