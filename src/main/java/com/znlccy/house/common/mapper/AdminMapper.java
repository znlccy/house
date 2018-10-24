package com.znlccy.house.common.mapper;

import com.znlccy.house.common.model.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-18:29
 * @Version: v1.0.0
 * @Comment: 管理员映射接口
 */

@Mapper
public interface AdminMapper {

    /* 声明查询所有管理员 */
    List<Admin> findAllAdmin();

    /* 声明通过主键查找管理员 */
    Admin findAdminById(Long aid);

    /* 声明添加管理员 */
    boolean saveAdmin(Admin admin);

    /* 声明更新管理员 */
    boolean updateAdmin(Admin admin);

    /* 声明通过主键删除管理员 */
    boolean deleteAdminById(Long aid);
}
