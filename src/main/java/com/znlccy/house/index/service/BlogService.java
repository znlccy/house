package com.znlccy.house.index.service;

import com.znlccy.house.common.model.Blog;

import java.util.List;

/**
 * @author: Adminstrator
 * @date: 2018/10/22 23:25
 * @version: v.1.0.0
 * @introduce: 博客服务接口类
 */
public interface BlogService {

    /* 声明查询所有博客 */
    List<Blog> findAllBlog();

    /* 声明通过主键查询博客 */
    Blog findBlogById(Long bid);

    /* 声明添加博客 */
    boolean saveBlog(Blog blog);

    /* 声明更新博客 */
    boolean updateBlog(Blog blog);

    /* 声明通过主键删除博客 */
    boolean deleteBlogById(Long bid);
}
