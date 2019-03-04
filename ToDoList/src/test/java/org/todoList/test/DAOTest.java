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
	
		// @Test 어노테이션 안 붙이면 java.lang.exception:no runnable methods 발생
		// 이러한 익셉션이 생기면 안에 TEST 할 메서드가 없다는 걸 뜻합니다.
		UserVO vo = new UserVO();
		vo.setUser_id("tnsska2");
		vo.setUser_pw("1234");
		vo.setUser_name("순남");
		vo.setUser_email("vnemftnsska2@naver.com");
		vo.setUser_age(4);
		vo.setUser_gender("남자");
		vo.setUser_job("강아지");
		vo.setUser_intro("강아지라고 얕보다가 큰코 다친다!!");
		
		dao.joinMember(vo);
	}
}
