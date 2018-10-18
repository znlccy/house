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

    List<User> findAllUser();
}
