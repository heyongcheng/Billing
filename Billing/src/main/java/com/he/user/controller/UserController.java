package com.he.user.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.he.base.BaseController;
import com.he.base.Json;
import com.he.user.model.User;
import com.he.user.service.UserService;
import com.he.utils.Security;
import com.he.utils.StringUtil;

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
	public Json login(String account,String password,HttpServletRequest request){
		Json json = new Json();
		if(StringUtil.isNull(account)){
			json.setMsg("用户名为空");
		}else if(StringUtil.isNull(password)){
			json.setMsg("密码为空");
		}else{
			User user = new User();
			user.setAccount(account);
			List<User> users = userService.find(user);
			if(users != null && !users.isEmpty()){
				if(Security.MD5(password).equals(users.get(0).getPassword())){
					json.setSuccess(true);
					getSession(request).setAttribute("l", users.get(0));
					init(users.get(0));
				}else{
					json.setMsg("密码错误");
				}
			}else{
				json.setMsg("用户名不存在");
			}
		}
		return json;
	}
	/**
	 * 初始化用户组织、权限
	 * @param user
	 */
	private void init(User user){
		
	}
}