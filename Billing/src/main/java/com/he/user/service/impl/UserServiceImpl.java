package com.he.user.service.impl;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.he.org.mapper.OrgMapper;
import com.he.resource.mapper.ResourceMapper;
import com.he.role.mapper.RoleMapper;
import com.he.role.model.Role;
import com.he.user.mapper.UserMapper;
import com.he.user.model.User;
import com.he.user.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	UserMapper userMapper;
	@Resource
	OrgMapper orgMapper;
	@Resource
	RoleMapper roleMapper;
	@Resource
	ResourceMapper resourceMapper;
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
	
	/**
	 * 初始化用户当前组织，角色，权限 信息
	 */
	@Override
	public void initUser(User user) {
		//初始化当前组织信息
		user.setCurrentOrg(orgMapper.selectByPrimaryKey(user.getOrgId()));
		//初始化当前组织下角色信息
		Role role = new Role();
		role.setOrgId(user.getOrgId());
		role.setUserId(user.getId());
		user.setRoles(roleMapper.findUserRole(role));
		//初始化当前组织下角色的权限
		if(user.getRoles() != null && !user.getRoles().isEmpty()){
			Iterator<Role> iter = user.getRoles().iterator();
			com.he.resource.model.Resource resource = new com.he.resource.model.Resource();
			while(iter.hasNext()){
				Role next = iter.next();
				resource.setRoleId(next.getId());
				resource.setStatus((byte)1);
				next.setResources(resourceMapper.findRoleResource(resource));
			}
		}
	}
}
