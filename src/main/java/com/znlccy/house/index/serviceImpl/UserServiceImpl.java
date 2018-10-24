package com.znlccy.house.index.serviceImpl;

import com.znlccy.house.common.model.User;
import com.znlccy.house.common.util.HashUtil;
import com.znlccy.house.index.service.UserService;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-19:31
 * @Version: v1.0.0
 * @Comment: 
 */
public class UserServiceImpl implements UserService {

    @Override
    public List<User> findAllUser() {
        return null;
    }

    @Override
    public User findUserById(Long uid) {
        return null;
    }

    /**
     * 1.插入数据库，非激活;密码加盐md5,保存头像到本地
     * 2.生成key，绑定email,发送到用户邮箱中
     * 3.发送邮件给用户
     * @param user
     * @return
     */
    @Override
    public boolean saveUser(User user) {
        user.setPassword(HashUtil.encryPassword(user.getPassword()));
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUserById(Long uid) {
        return false;
    }
}
