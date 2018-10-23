package com.znlccy.house.admin.service;

import com.znlccy.house.common.model.Blog;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/22-16:47
 * @Version: v1.0.0
 * @Comment: 博客服务接口
 */
public interface BlogService {

    /* 声明查询所有博客 */
    List<Blog> findAllBlog();

    /* 声明查找博客 */
    Blog findBlogById(Long bid);

    /* 声明保存博客 */
    void saveBlog(Blog blog);

    /* 声明更新博客 */
    void updateBlog(Blog blog);

    /* 声明删除博客 */
    void deleteBlogById(Long bid);
}
