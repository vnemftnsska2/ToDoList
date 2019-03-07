package org.todoList.service;

import org.todoList.domain.LoginDTO;
import org.todoList.domain.UserVO;

public interface UserService {
	
	public void joinMemerService(UserVO vo) throws Exception;
	
	public UserVO userLoginService(LoginDTO dto) throws Exception;
}
