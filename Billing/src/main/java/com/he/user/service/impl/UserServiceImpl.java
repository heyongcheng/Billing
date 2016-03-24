package com.he.user.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.he.user.mapper.UserMapper;
import com.he.user.model.User;
import com.he.user.service.UserService;

public class UserServiceImpl implements UserService {

	@Resource
	UserMapper userMapper;
	@Override
	public int deleteByPrimaryKey(Long id) {
		return 0;
	}

	@Override
	public int insert(User record) {
		return 0;
	}

	@Override
	public int insertSelective(User record) {
		return 0;
	}

	@Override
	public User selectByPrimaryKey(Long id) {
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		return 0;
	}

	@Override
	public int updateByPrimaryKey(User record) {
		return 0;
	}

	@Override
	public long count(User record) {
		return 0;
	}

	@Override
	public List<User> find(User record) {
		return null;
	}
	
}
