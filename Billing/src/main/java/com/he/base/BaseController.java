package com.he.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.he.manage.model.User;

public class BaseController {
	
	/**
	 * 获取session
	 * @param request
	 * @return
	 */
	protected HttpSession getSession(HttpServletRequest request){
		return request.getSession();
	}
	/**
	 * 获取登录用户
	 * @param request
	 * @return
	 */
	protected User getLoginUser(HttpServletRequest request){
		return (User)getSession(request).getAttribute("loginUser");
	}
}
