package com.he.controller.manage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.he.model.manage.User;

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
