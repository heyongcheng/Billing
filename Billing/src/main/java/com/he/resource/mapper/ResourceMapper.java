package com.he.resource.mapper;

import java.util.List;

import com.he.base.BaseMapper;
import com.he.resource.model.Resource;

public interface ResourceMapper extends BaseMapper<Resource>{

	List<Resource> findRoleResource(com.he.resource.model.Resource resource);
	
}