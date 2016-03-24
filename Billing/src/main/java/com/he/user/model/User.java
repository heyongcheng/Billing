package com.he.user.model;

import java.util.Date;
import java.util.List;

import com.he.base.BaseModel;
import com.he.org.model.Org;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class User extends BaseModel{
    private Long id;

    private Integer orgId;

    private String account;

    private String password;

    private String name;

    private String idCard;

    private String mobile;

    private String address;

    private Date birthday;

    private Byte sex;

    private Byte deleteFlag;
    /**用户辅助组织列表**/
    private List<Org> supplyOrgs;

    private Date createTime;

    private Date updateTime;

    private String createBy;

    private String updateBy;

    private String deleteBy;

    private String reserved1;

    private String reserved2;

    private String reserved3;

    private String reserved4;

    private String reserved5;
}