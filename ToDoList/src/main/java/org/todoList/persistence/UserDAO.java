package org.todoList.persistence;

import org.todoList.domain.UserVO;

public interface UserDAO {

	// 회원가입
	public void joinMember(UserVO vo)throws Exception;
	
}
