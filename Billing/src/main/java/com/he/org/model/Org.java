package com.he.org.model;

import java.util.Date;

import com.he.base.BaseModel;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Org extends BaseModel{
    private Integer id;

    private String code;

    private String name;

    private Integer parentId;

    private String desc;

    private Byte status;

    private Date createTime;

    private Long createBy;

    private Date updateTime;

    private Long updateBy;
}