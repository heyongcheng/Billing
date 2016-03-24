package com.he.user.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.he.base.BaseController;
import com.he.base.Json;
import com.he.user.service.UserService;

@Controller
@RequestMapping("/manage")
public class UserController extends BaseController{

	@Resource
	UserService userService;
	/**
	 * 登录
	 * @param loginName
	 * @param password
	 * @param request
	 * @return
	 */
	@RequestMapping(value="login",method=RequestMethod.GET)
	@ResponseBody
	public Json login(String loginName,String password,HttpServletRequest request){
		Json json = new Json();
		
		return json;
	}
}
