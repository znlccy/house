package com.znlccy.house.common.mapper;

import com.znlccy.house.common.model.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-18:33
 * @Version: v1.0.0
 * @Comment: 评论映射接口
 */

@Mapper
public interface CommentMapper {

    /* 声明查询所有评论 */
    List<Comment> findAllComment();

    /* 声明通过主键查询评论 */
    Comment findCommentById(Long cid);

    /* 声明添加评论 */
    void saveComment(Comment comment);

    /* 声明更新评论 */
    void updateComment(Comment comment);

    /* 声明通过主键删除评论 */
    void deleteCommentById(Long cid);
}
