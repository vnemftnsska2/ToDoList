package org.todoList.persistence;

import org.todoList.domain.UserVO;

public interface UserDAO {

	// ȸ������
	public void joinMember(UserVO vo)throws Exception;
	
	// �α���
	public void userLogin(String user_id)throws Exception;
}
