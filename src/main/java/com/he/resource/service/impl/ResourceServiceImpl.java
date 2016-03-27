package com.he.resource.service.impl;

import com.he.resource.mapper.ResourceMapper;
import com.he.resource.model.Tree;
import com.he.resource.service.ResourceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by HE on 2016/3/26.
 */
@Service("resourceService")
public class ResourceServiceImpl implements ResourceService{
    @Resource
    ResourceMapper resourceMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return resourceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(com.he.resource.model.Resource record) {
        return resourceMapper.insert(record);
    }

    @Override
    public int insertSelective(com.he.resource.model.Resource record) {
        return resourceMapper.insertSelective(record);
    }

    @Override
    public com.he.resource.model.Resource selectByPrimaryKey(Long id) {
        return resourceMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(com.he.resource.model.Resource record) {
        return resourceMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKey(com.he.resource.model.Resource record) {
        return resourceMapper.updateByPrimaryKey(record);
    }

    @Override
    public long count(com.he.resource.model.Resource record) {
        return resourceMapper.count(record);
    }

    @Override
    public List<com.he.resource.model.Resource> find(com.he.resource.model.Resource record) {
        return resourceMapper.find(record);
    }

    /**
     * 根据子节点，构造树
     * @param resources
     * @return
     */
    @Override
    public List<Tree> buildTreeByChildren(List<com.he.resource.model.Resource> resources) {
        //顶级tree
        List<Tree> roots = new ArrayList<Tree>();
        if(resources != null && !resources.isEmpty()){
            Iterator<com.he.resource.model.Resource> iter = resources.iterator();
            while (iter.hasNext()){
                roots.add(iter.next().buildTree());
            }
            appendToRoot(roots);
        }
        return roots;
    }

    /**
     * 将节点添加到根
     * @param roots
     */
    private void appendToRoot(List<Tree> roots){
        Set<Long> set = new HashSet<Long>();
        for (Tree tree : roots){
            set.add(tree.getId());
        }
        findParentTree(roots,set);
        Iterator<Tree> iter1 = roots.iterator();
        lab:
        while (iter1.hasNext()){
            Tree t1 = iter1.next();
            if(!isRoot(t1.getPid())){
                Iterator<Tree> iter2 = roots.iterator();
                while (iter2.hasNext()){
                    //t1属于t2
                    if(appendTo(t1,iter2.next())){
                        iter1.remove();
                        continue lab;
                    }
                }
            }
        }
    }

    /**
     * t1添加到t2
     * @param t1
     * @param t2
     * @return
     */
    private boolean appendTo(Tree t1,Tree t2){
        if(t1.getPid().longValue() == t2.getId().longValue()){
            //将t1加入到t2中
            if(t2.getChildren() == null){
                t2.setChildren(new ArrayList<Tree>());
            }
            t2.getChildren().add(t1);
            return true;
        }else if(t2.getChildren() != null){
            Iterator<Tree> children = t2.getChildren().iterator();
            while (children.hasNext()){
                appendTo(t1, children.next());
            }
        }
        return false;
    }
    /**
     * 查询父节点
     * @param trees
     * @param exists
     */
    private void findParentTree(List<Tree> trees,Set<Long> exists){
        //结束标识
        List<Tree> addList = null;
        Iterator<Tree> iter = trees.iterator();
        while (iter.hasNext()) {
            Long pid = iter.next().getPid();
            if(!isRoot(pid) && exists.add(pid)){
                com.he.resource.model.Resource res = resourceMapper.selectByPrimaryKey(pid);
                if(res != null){
                    if(addList == null)
                        addList = new ArrayList<Tree>();
                    addList.add(res.buildTree());
                }
            }
        }
        if(addList != null){
            trees.addAll(addList);
            findParentTree(trees,exists);
        }
    }

    /**
     * 判断是否为根节点
     * @param pid
     * @return
     */
    private boolean isRoot(Long pid){
        return pid == null || pid == 0;
    }
}
