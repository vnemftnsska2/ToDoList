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
		
		// request 객체를 통해 Session 요청
		HttpSession session = request.getSession();
		// Controller에서 Model 객체에 담아 놓은 userVO를 가져오기 위해
		// Interceptor에서 사용하는 modelMap 사용(사실 정확히 모름)
		ModelMap modelMap = modelAndView.getModelMap();
		Object userVO = modelMap.get("userVO");
		
		// userVO 유무 console 확인
		System.out.println(userVO);
		
		// userVO 객체가 있다면 session에 userVO 정보를 담는다.
		if(userVO != null) {
			// session에 userVO 객체 담음
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
