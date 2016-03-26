package com.he.base;

import java.util.List;

public interface BaseService<T> {
	/**
	 * 根据主键删除
	 * @param id
	 * @return
	 */
	int deleteByPrimaryKey(Long id);
	/**
	 * 新增
	 * @param record
	 * @return
	 */
    int insert(T record);
    /**
     * 根据非空字段新增
     * @param record
     * @return
     */
    int insertSelective(T record);
    /**
     * 根据主键查询
     * @param id
     * @return
     */
    T selectByPrimaryKey(Long id);
    /**
     * 根据主键更新非空字段
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(T record);
    /**
     * 根据主键更新所有字段
     * @param record
     * @return
     */
    int updateByPrimaryKey(T record);
    /**
     * 根据条件查询数量
     * @param record
     * @return
     */
    long count(T record);
    /**
     * 根据条件查询记录
     * @param record
     * @return
     */
    List<T> find(T record);
}
