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
		
		// ��ȿ�� �˻�� service���� ó���ϰ� user_id ���� �ѱ��,
		// user_id�� ��ġ�ϴ� �������� ��� ������ �����´�.
		sqlSession.selectOne(namespace + ".userLogin", user_id);
	}

	
}
