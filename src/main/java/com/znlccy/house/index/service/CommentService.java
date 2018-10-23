package com.znlccy.house.index.service;

import com.znlccy.house.common.model.Comment;

import java.util.List;

/**
 * @author: Adminstrator
 * @date: 2018/10/22 23:26
 * @version: v.1.0.0
 * @introduce: 评论服务接口类
 */
public interface CommentService {

    /* 声明查询所有评论 */
    List<Comment> findAllComment();

    /* 声明通过主键查找评论 */
    Comment findCommentById(Long cid);

    /* 声明保存评论 */
    void saveComment(Comment comment);

    /* 声明更新评论 */
    void updateComment(Comment comment);

    /* 声明通过主键删除评论 */
    void deleteCommentById(Long cid);

}
