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

    List<User> findAllUser();
}
