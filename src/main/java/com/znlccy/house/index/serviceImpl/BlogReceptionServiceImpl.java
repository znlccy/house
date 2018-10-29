package com.znlccy.house.index.serviceImpl;

import com.znlccy.house.common.model.Blog;
import com.znlccy.house.index.service.BlogReceptionService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Adminstrator
 * @date: 2018/10/22 23:28
 * @version: v.1.0.0
 * @introduce: 博客服务实现类
 */
@Service
public class BlogReceptionServiceImpl implements BlogReceptionService {

    @Override
    public List<Blog> findAllBlog() {
        return null;
    }

    @Override
    public Blog findBlogById(Long bid) {
        return null;
    }

    @Override
    public boolean saveBlog(Blog blog) {
        return false;
    }

    @Override
    public boolean updateBlog(Blog blog) {
        return false;
    }

    @Override
    public boolean deleteBlogById(Long bid) {
        return false;
    }
}
