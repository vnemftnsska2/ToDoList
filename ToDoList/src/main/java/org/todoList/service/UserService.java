package org.todoList.service;

import org.todoList.domain.UserVO;

public interface UserService {
	
	public void joinMemerService(UserVO vo) throws Exception;
	
	public String userLoginService(String user_id, String user_pw) throws Exception;
}
