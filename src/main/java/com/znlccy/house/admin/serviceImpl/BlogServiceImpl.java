package com.znlccy.house.admin.serviceImpl;

import com.znlccy.house.admin.service.BlogService;
import com.znlccy.house.common.mapper.BlogMapper;
import com.znlccy.house.common.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/22-16:55
 * @Version: v1.0.0
 * @Comment: 博客服务实现类
 */
/*@Service*/
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public List<Blog> findAllBlog() {
        return blogMapper.findAllBlog();
    }

    @Override
    public Blog findBlogById(Long bid) {
        return blogMapper.findBlogById(bid);
    }

    @Override
    public void saveBlog(Blog blog) {
        blogMapper.saveBlog(blog);
    }

    @Override
    public void updateBlog(Blog blog) {
        blogMapper.updateBlog(blog);
    }

    @Override
    public void deleteBlogById(Long bid) {
        blogMapper.deleteBlogById(bid);
    }
}
