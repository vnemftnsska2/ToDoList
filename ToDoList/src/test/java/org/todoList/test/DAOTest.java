package org.todoList.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.todoList.domain.UserVO;
import org.todoList.persistence.UserDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class DAOTest {

	@Inject
	private UserDAO dao;
	
	@Test
	public void testJoinMember()throws Exception{
	
		// @Test ������̼� �� ���̸� java.lang.exception:no runnable methods �߻�
		// �̷��� �ͼ����� ����� �ȿ� TEST �� �޼��尡 ���ٴ� �� ���մϴ�.
		UserVO vo = new UserVO();
		vo.setUser_id("tnsska2");
		vo.setUser_pw("1234");
		vo.setUser_name("����");
		vo.setUser_email("vnemftnsska2@naver.com");
		vo.setUser_age(4);
		vo.setUser_gender("����");
		vo.setUser_job("������");
		vo.setUser_intro("��������� �躸�ٰ� ū�� ��ģ��!!");
		
		dao.joinMember(vo);
	}
}
