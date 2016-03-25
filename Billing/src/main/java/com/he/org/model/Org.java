package com.he.org.model;

import java.util.Date;

import com.he.base.BaseModel;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Org extends BaseModel{
    private Long id;

    private String code;

    private String name;

    private Long parentId;

    private String remark;

    private Byte status;

    private Date createTime;

    private Long createBy;

    private Date updateTime;

    private Long updateBy;
}