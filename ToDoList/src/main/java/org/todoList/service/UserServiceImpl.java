package org.todoList.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.todoList.domain.UserVO;
import org.todoList.persistence.UserDAO;

@Service
public class UserServiceImpl implements UserService {

	@Inject
	private UserDAO userDao;
	
	@Override
	public void joinMemerService(UserVO vo) throws Exception {

		userDao.joinMember(vo);
	}

	@Override
	public String userLoginService(String user_id, String user_pw) throws Exception {

		
		
		return null;
	}

	
}
