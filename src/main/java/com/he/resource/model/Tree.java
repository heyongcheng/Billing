package com.he.resource.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by HE on 2016/3/26.
 */
@Setter
@Getter
public class Tree {
    private Long id;
    private Long pid;
    private String text;
    private String state;
    private String iconCls;
    private boolean checked;
    private Attribute attribute;
    private List<Tree> children;
}