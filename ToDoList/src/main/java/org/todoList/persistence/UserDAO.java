package org.todoList.persistence;

import org.todoList.domain.UserVO;

public interface UserDAO {

	// 회원가입
	public void joinMember(UserVO vo)throws Exception;
	
	// 로그인
	public void userLogin(String user_id)throws Exception;
}
