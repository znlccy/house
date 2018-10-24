package com.znlccy.house.index.controller;

import com.znlccy.house.admin.service.BlogService;
import com.znlccy.house.common.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author: Adminstrator
 * @date: 2018/10/22 23:23
 * @version: v.1.0.0
 * @introduce: 博客控制器
 */

@Controller
@RequestMapping(value = "/index/blog")
public class BlogController {

    /**
     * 注入博客服务
     */
    @Autowired
    private BlogService blogService;

    /**
     * 查询所有博客
     * @return
     */
    @GetMapping(value = "/all")
    public String findAllBlog() {
        return "/index/blog/all";
    }

    /**
     * 查询博客详情
     * @param bid
     * @return
     */
    @GetMapping(value = "/get/#{id}")
    public String findBlogById(@PathVariable Long bid) {
        return "/index/blog/detail";
    }

    /**
     * 添加博客
     * @param blog
     * @return
     */
    @PostMapping(value = "/save")
    public String saveBlog(@RequestBody Blog blog) {
        return "/index/blog/save";
    }

    /**
     * 更新博客
     * @param blog
     * @return
     */
    @PutMapping(value = "/update")
    public String updateBlog(@RequestBody Blog blog) {
        return "/index/blog/update";
    }

    /**
     * 删除博客
     * @return
     */
    @DeleteMapping(value = "/delete/#{bid}")
    public String deleteBlogById() {
        return "/index/blog/delete";
    }
}
