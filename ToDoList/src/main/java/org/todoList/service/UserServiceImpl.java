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

	// 2019.03.08 AM 12:11 인터셉터 설정 및 로그인 기능 구현
	// 1. 인터셉터 설정부터
	// 2. 로그인 기능 구현(유효성 검사는 서버 사이드에서 실시)
	// 3. ValidationCheck 클래스 별도로 제작해서 유효성 검사 불러서 쓸 예정
	@Override
	public String userLoginService(LoginDTO dto) throws Exception {

		// 우선 LoginDTO를 넘기기 전에 유효성 검사 진행
		// 1. LoginDTO가 비어있는지 확인
		// 2. != null -> id : 영어 or 숫자  6자 이하인지 체크
		// 3. != null -> pw : 영어 + 숫자 8자 이하인지 체크
		/*if(dto != null) {
			
			
			
		} else {
			System.out.println("LoginDTO : " + dto);
		}*/
		
		
		// LoginDTO(로그인 정보)를 DAO를 통해 확인
		userDao.userLogin(dto);
		
		
		return null;
	}

	
}
