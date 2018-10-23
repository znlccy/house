package com.znlccy.house.index.serviceImpl;

import com.znlccy.house.common.model.Blog;
import com.znlccy.house.index.service.BlogService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Adminstrator
 * @date: 2018/10/22 23:28
 * @version: v.1.0.0
 * @introduce: 博客服务实现类
 */
@Service
public class BlogServiceImpl implements BlogService {

    @Override
    public List<Blog> findAllBlog() {
        return null;
    }

    @Override
    public Blog findBlogById(Long bid) {
        return null;
    }

    @Override
    public void saveBlog(Blog blog) {

    }

    @Override
    public void updateBlog(Blog blog) {

    }

    @Override
    public void deleteBlogById(Long bid) {

    }
}
