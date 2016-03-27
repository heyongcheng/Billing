package com.he.resource.model;

import com.he.base.BaseModel;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Resource extends BaseModel{
    private Long id;

    private String path;

    private String name;

    private Byte type;

    private Long pId;
    /**角色ID**/
    private Long roleId;

    private String remark;

    private Byte status;

    private String icon;

    private Integer seq;

    /**
     * 构建tree
     * @return
     */
    public Tree buildTree(){
        Tree tree = new Tree();
        tree.setId(id);
        tree.setPid(pId);
        tree.setText(name);
        Attribute attr = new Attribute();
        attr.setUrl(path);
        attr.setType(type);
        tree.setAttributes(attr);
        return tree;
    }
}