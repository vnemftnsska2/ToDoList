package org.todoList.persistence;

import org.todoList.domain.LoginDTO;
import org.todoList.domain.UserVO;

public interface UserDAO {

	// ȸ������
	public void joinMember(UserVO vo)throws Exception;
	
	// �α���
	public UserVO userLogin(LoginDTO dto)throws Exception;
	
	// �α��� �� LogDate ����
	public void userLogDate(LoginDTO dto)throws Exception;
}
