package com.he.manage.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class User {
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