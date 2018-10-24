package com.znlccy.house.common.mapper;

import com.znlccy.house.common.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-18:35
 * @Version: v1.0.0
 * @Comment: 用户映射接口
 */

@Mapper
public interface UserMapper {

    /* 声明查询所有用户 */
    List<User> findAllUser();

    /* 声明通过主键查找用户 */
    User findUserById(Long uid);

    /* 声明添加用户 */
    boolean saveUser(User user);

    /* 声明更新用户 */
    boolean updateUser(User user);

    /* 声明通过主键删除用户 */
    boolean deleteUserById(Long uid);
}
