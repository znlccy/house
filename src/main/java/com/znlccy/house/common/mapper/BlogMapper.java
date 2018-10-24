package com.znlccy.house.common.mapper;

import com.znlccy.house.common.model.Blog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-18:33
 * @Version: v1.0.0
 * @Comment: 博客映射接口
 */

@Mapper
public interface BlogMapper {

    /* 声明查询所有博客 */
    List<Blog> findAllBlog();

    /* 声明通过主键查询博客 */
    Blog findBlogById(Long bid);

    /* 声明保存博客 */
    boolean saveBlog(Blog blog);

    /* 声明更新博客 */
    boolean updateBlog(Blog blog);

    /* 声明通过主键删除博客 */
    boolean deleteBlogById(Long bid);
}
