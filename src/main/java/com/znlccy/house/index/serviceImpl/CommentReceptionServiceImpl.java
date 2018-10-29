package com.znlccy.house.index.serviceImpl;

import com.znlccy.house.common.model.Comment;
import com.znlccy.house.index.service.CommentReceptionService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Adminstrator
 * @date: 2018/10/22 23:29
 * @version: v.1.0.0
 * @introduce: 评论服务实现类
 */
@Service
public class CommentReceptionServiceImpl implements CommentReceptionService {

    @Override
    public List<Comment> findAllComment() {
        return null;
    }

    @Override
    public Comment findCommentById(Long cid) {
        return null;
    }

    @Override
    public boolean saveComment(Comment comment) {
        return false;
    }

    @Override
    public boolean updateComment(Comment comment) {
        return false;
    }

    @Override
    public boolean deleteCommentById(Long cid) {
        return false;
    }
}
