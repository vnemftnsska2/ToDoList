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
			
		// ��ȿ�� �˻�� service���� ó���ϰ� user_id ���� �ѱ��,
		// user_id�� ��ġ�ϴ� �������� ��� ������ �����´�.
		
		// 2���� Parameter�� ������ ���� Map ��ü �̿�
		Map<String, String> loginInfo = new HashMap<>();
		loginInfo.put("user_id", dto.getUser_id());
		loginInfo.put("user_pw", dto.getUser_pw());
		
		
		return sqlSession.selectOne(namespace + ".userLogin", loginInfo);
	}
	

	@Override
	@Transactional
	public void userLogDate(LoginDTO dto) throws Exception {
		
		// �ش� user_id logDate ����
		String user_id = dto.getUser_id();
		
		sqlSession.update(namespace + ".userRogDate", user_id);		
	}




	
}
