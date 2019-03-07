package org.todoList.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
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
	public void userLogin(String user_id) throws Exception {
		
		// 유효성 검사는 service에서 처리하고 user_id 값만 넘기고,
		// user_id와 일치하는 데이터의 모든 정보를 가져온다.
		sqlSession.selectOne(namespace + ".userLogin", user_id);
	}

	
}
