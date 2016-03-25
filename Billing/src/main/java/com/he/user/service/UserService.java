package com.he.user.service;

import com.he.base.BaseService;
import com.he.user.model.User;

public interface UserService extends BaseService<User>{
	/**
	 * 初始化用户信息
	 * @param user
	 */
	public void initUser(User user);
}
