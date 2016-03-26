package com.he.resource.controller;

import com.he.base.BaseController;
import com.he.resource.model.Tree;
import com.he.resource.service.ResourceService;
import com.he.role.model.Role;
import com.he.user.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * Created by HE on 2016/3/26.
 */
@Controller
@RequestMapping("/resource")
public class ResourceController extends BaseController{

    @Resource
    ResourceService resourceService;

    /**
     * 加载用户资源列表
     * @return
     */
    @RequestMapping("load")
    @ResponseBody
    public List<Tree> load(HttpServletRequest request){
        List<Tree> tree = new ArrayList<Tree>();
        User user =  getLoginUser(request);
        //用户资源列表
        Set<String> urlSet = new HashSet<String>();
        List<com.he.resource.model.Resource> list = new ArrayList<com.he.resource.model.Resource>();
        Iterator<Role> roleIter =  user.getRoles().iterator();
        while (roleIter.hasNext()){
           Iterator<com.he.resource.model.Resource> resIter = roleIter.next().getResources().iterator();
            while(resIter.hasNext()){
                com.he.resource.model.Resource res = resIter.next();
                if(urlSet.add(res.getPath())){
                    list.add(res);
                }
            }
        }
        try {
            return resourceService.buildTreeByChildren(list);
        }catch (Exception e){
            e.printStackTrace();
        }

        return  null;
    }
}
