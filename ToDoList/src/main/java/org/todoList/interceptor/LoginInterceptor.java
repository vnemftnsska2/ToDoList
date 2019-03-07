package org.todoList.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{

	private static final Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);
	private static final String LOGIN = "login";
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception{
		
		// Reaction Check
		logger.info("PostHandle Reaction Check!!");
		
		// request ��ü�� ���� Session ��û
		HttpSession session = request.getSession();
		// Controller���� Model ��ü�� ��� ���� userVO�� �������� ����
		// Interceptor���� ����ϴ� modelMap ���(��� ��Ȯ�� ��)
		ModelMap modelMap = modelAndView.getModelMap();
		Object userVO = modelMap.get("userVO");
		
		// userVO ���� console Ȯ��
		System.out.println(userVO);
		
		// userVO ��ü�� �ִٸ� session�� userVO ������ ��´�.
		if(userVO != null) {
			// session�� userVO ��ü ����
			session.setAttribute(LOGIN, userVO);
			response.sendRedirect("/");
		}
	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
		
		// reaction check
		logger.info("PreHandle Reaction Check!!");
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute(LOGIN) != null) {
			logger.info("clear login data before");
			session.removeAttribute(LOGIN);
		}
		
		return true;
	}
}
