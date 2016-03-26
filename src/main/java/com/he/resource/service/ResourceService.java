package com.he.resource.service;

import com.he.base.BaseService;
import com.he.resource.model.Resource;
import com.he.resource.model.Tree;

import java.util.List;

/**
 * Created by HE on 2016/3/26.
 */
public interface ResourceService extends BaseService<Resource>{

    public List<Tree> buildTreeByChildren(List<Resource> resources);
}
