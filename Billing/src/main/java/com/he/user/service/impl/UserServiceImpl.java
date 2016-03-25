package com.he.user.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.he.user.mapper.UserMapper;
import com.he.user.model.User;
import com.he.user.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	UserMapper userMapper;
	@Override
	public int deleteByPrimaryKey(Long id) {
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(User record) {
		return userMapper.insert(record);
	}

	@Override
	public int insertSelective(User record) {
		return userMapper.insertSelective(record);
	}

	@Override
	public User selectByPrimaryKey(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		return userMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(User record) {
		return userMapper.updateByPrimaryKey(record);
	}

	@Override
	public long count(User record) {
		return userMapper.count(record);
	}

	@Override
	public List<User> find(User record) {
		return userMapper.find(record);
	}
	
}
