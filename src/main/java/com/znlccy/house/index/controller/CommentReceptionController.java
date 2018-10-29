package com.znlccy.house.index.controller;

import com.znlccy.house.common.model.Comment;
import com.znlccy.house.index.service.CommentReceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author: Adminstrator
 * @date: 2018/10/22 23:23
 * @version: v.1.0.0
 * @introduce: 评论控制器
 */

@Controller
@RequestMapping(value = "/index/comment")
public class CommentReceptionController {

    /**
     * 注入评论服务
     */
    @Autowired
    private CommentReceptionService commentService;

    /**
     * 查询所有评论
     * @return
     */
    @GetMapping(value = "/all")
    public String findAllComment() {
        return "/index/comment/all";
    }

    /**
     * 查询评论详情
     * @param cid
     * @return
     */
    @GetMapping(value = "/get/{#cid}")
    public String findCommentById(@PathVariable Long cid) {
        return "/index/comment/detail";
    }

    /**
     * 添加评论
     * @param comment
     * @return
     */
    @PostMapping(value = "/save")
    public String saveComment(@RequestBody Comment comment) {
        return "/index/comment/save";
    }

    /**
     * 更新评论
     * @param comment
     * @return
     */
    @PutMapping(value = "/update")
    public String updateComment(@RequestBody Comment comment) {
        return "/index/comment/update";
    }

    /**
     * 删除评论
     * @param cid
     * @return
     */
    @DeleteMapping(value = "/delete/{#cid}")
    public String deleteCommentById(@PathVariable Long cid) {
        return "/index/comment/delete";
    }
}
