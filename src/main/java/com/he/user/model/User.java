package com.he.user.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.he.base.BaseModel;
import com.he.org.model.Org;
import com.he.role.model.Role;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class User extends BaseModel{
    private Long id;

    private Long orgId;

    private String account;
    @JsonIgnore
    private String password;

    private String name;

    private String idCard;

    private String mobile;

    private String address;

    private Date birthday;

    private Byte sex;
    
    private Byte status;
    @JsonIgnore
    private Byte deleteFlag;
    /**用户辅助组织列表**/
    @JsonIgnore
    private List<Org> supplyOrgs;
    /**用户当前登录组织**/
    @JsonIgnore
    private Org currentOrg;
    /**用户角色列表**/
    @JsonIgnore
    private List<Role> roles;

    private Date createTime;

    private Date updateTime;
    @JsonIgnore
    private String createBy;
    @JsonIgnore
    private String updateBy;
    @JsonIgnore
    private String deleteBy;
    @JsonIgnore
    private String reserved1;
    @JsonIgnore
    private String reserved2;
    @JsonIgnore
    private String reserved3;
    @JsonIgnore
    private String reserved4;
    @JsonIgnore
    private String reserved5;
}