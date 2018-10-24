package com.znlccy.house.common.mapper;

import com.znlccy.house.common.model.Permission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-18:34
 * @Version: v1.0.0
 * @Comment: 权限映射接口
 */

@Mapper
public interface PermissionMapper {

    /* 声明查找所有权限 */
    List<Permission> findAllPermission();

    /* 声明通过主键查询权限 */
    Permission findPermissionById(Long pid);

    /* 声明添加权限 */
    boolean savePermission(Permission permission);

    /* 声明更新权限 */
    boolean updatePermission(Permission permission);

    /* 声明通过主键删除权限 */
    boolean deletePermissionById(Long pid);
}
