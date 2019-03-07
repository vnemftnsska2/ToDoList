package org.todoList.persistence;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.todoList.domain.LoginDTO;
import org.todoList.domain.UserVO;

@Repository
public class UserDAOImpl implements UserDAO {
 
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "org.todoList.mapper.UserMapper";
	
	@Override
	public void joinMember(UserVO vo) throws Exception {
		sqlSession.insert(namespace + ".joinMember", vo);
	}

	@Override
	public UserVO userLogin(LoginDTO dto) throws Exception {
			
		// 유효성 검사는 service에서 처리하고 user_id 값만 넘기고,
		// user_id와 일치하는 데이터의 모든 정보를 가져온다.
		
		// 2개의 Parameter를 보내기 위해 Map 객체 이용
		Map<String, String> loginInfo = new HashMap<>();
		loginInfo.put("user_id", dto.getUser_id());
		loginInfo.put("user_pw", dto.getUser_pw());
		
		
		return sqlSession.selectOne(namespace + ".userLogin", loginInfo);
	}
	

	@Override
	@Transactional
	public void userLogDate(LoginDTO dto) throws Exception {
		
		// 해당 user_id logDate 수정
		String user_id = dto.getUser_id();
		
		sqlSession.update(namespace + ".userRogDate", user_id);		
	}




	
}
