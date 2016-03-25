package com.he.role.mapper;

import java.util.List;

import com.he.base.BaseMapper;
import com.he.role.model.Role;

public interface RoleMapper extends BaseMapper<Role>{

	List<Role> findUserRole(Role role);
	
}