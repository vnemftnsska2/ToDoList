package org.todoList.persistence;

import org.todoList.domain.LoginDTO;
import org.todoList.domain.UserVO;

public interface UserDAO {

	// 회원가입
	public void joinMember(UserVO vo)throws Exception;
	
	// 로그인
	public UserVO userLogin(LoginDTO dto)throws Exception;
	
	// 로그인 시 LogDate 수정
	public void userLogDate(LoginDTO dto)throws Exception;
}
