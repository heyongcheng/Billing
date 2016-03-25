package com.he.org.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.he.org.mapper.OrgMapper;
import com.he.org.model.Org;
import com.he.org.service.OrgService;
@Service("orgService")
public class OrgServiceImpl implements OrgService{

	@Resource
	OrgMapper orgMapper;
	@Override
	public int deleteByPrimaryKey(Long id) {
		return orgMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Org record) {
		return orgMapper.insert(record);
	}

	@Override
	public int insertSelective(Org record) {
		return orgMapper.insertSelective(record);
	}

	@Override
	public Org selectByPrimaryKey(Long id) {
		return orgMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Org record) {
		return orgMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Org record) {
		return orgMapper.updateByPrimaryKey(record);
	}

	@Override
	public long count(Org record) {
		return orgMapper.count(record);
	}

	@Override
	public List<Org> find(Org record) {
		return orgMapper.find(record);
	}

}
