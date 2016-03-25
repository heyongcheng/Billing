package com.he.role.model;

import java.util.List;

import com.he.base.BaseModel;
import com.he.resource.model.Resource;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Role extends BaseModel{
    private Long id;

    private Long orgId;
    /**用户ID**/
    private Long userId;
    
    private String name;

    private String remark;

    private Byte type;

    private Long parentId;
    /**角色权限列表**/
    private List<Resource> resources;
}