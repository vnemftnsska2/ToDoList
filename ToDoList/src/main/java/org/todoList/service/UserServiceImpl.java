package org.todoList.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.todoList.domain.LoginDTO;
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

	// 2019.03.08 AM 12:11 ���ͼ��� ���� �� �α��� ��� ����
	// 1. ���ͼ��� ��������
	// 2. �α��� ��� ����(��ȿ�� �˻�� ���� ���̵忡�� �ǽ�)
	// 3. ValidationCheck Ŭ���� ������ �����ؼ� ��ȿ�� �˻� �ҷ��� �� ����
	@Override
	public String userLoginService(LoginDTO dto) throws Exception {

		// �켱 LoginDTO�� �ѱ�� ���� ��ȿ�� �˻� ����
		// 1. LoginDTO�� ����ִ��� Ȯ��
		// 2. != null -> id : ���� or ����  6�� �������� üũ
		// 3. != null -> pw : ���� + ���� 8�� �������� üũ
		/*if(dto != null) {
			
			
			
		} else {
			System.out.println("LoginDTO : " + dto);
		}*/
		
		
		// LoginDTO(�α��� ����)�� DAO�� ���� Ȯ��
		userDao.userLogin(dto);
		
		
		return null;
	}

	
}
