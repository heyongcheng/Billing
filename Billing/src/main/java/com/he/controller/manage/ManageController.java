package com.he.controller.manage;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/manage")
public class ManageController extends BaseController{

	/**
	 * 登录
	 * @param loginName
	 * @param password
	 * @param request
	 * @return
	 */
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String login(String loginName,String password,HttpServletRequest request){
		
		return "index";
	}
}
