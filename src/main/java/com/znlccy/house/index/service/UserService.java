package com.znlccy.house.index.service;

import com.znlccy.house.common.model.User;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-19:30
 * @Version: v1.0.0
 * @Comment: 用户服务接口
 */

public interface UserService {

    /* 声明查找所有用户 */
    List<User> findAllUser();

    /* 声明通过主键查询用户 */
    User findUserById(Long uid);

    /* 声明添加用户 */
    boolean saveUser(User user);

    /* 声明更新用户 */
    boolean updateUser(User user);

    /* 声明通过主键删除用户 */
    boolean deleteUserById(Long uid);
}
