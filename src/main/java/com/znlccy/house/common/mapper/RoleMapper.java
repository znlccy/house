package com.znlccy.house.common.mapper;

import com.znlccy.house.common.model.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-18:34
 * @Version: v1.0.0
 * @Comment: 角色映射接口0
 */

@Mapper
public interface RoleMapper {

    /* 声明查询所有角色 */
    List<Role> findAllRole();

    /* 声明通过主键查询角色 */
    Role findRoleById(Long rid);

    /* 声明添加权限 */
    void saveRole(Role role);

    /* 声明更新权限 */
    void updateRole(Role role);

    /* 声明通过主键删除角色 */
    void deleteRoleById(Long rid);
}
