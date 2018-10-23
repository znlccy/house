package com.znlccy.house.common.mapper;

import com.znlccy.house.common.model.Agency;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-18:30
 * @Version: v1.0.0
 * @Comment: 房屋机构映射机构
 */

@Mapper
public interface AgencyMapper {

    /* 声明查询所有房屋机构 */
    List<Agency> findAllAgency();

    /* 声明通过主键查找房屋机构 */
    Agency findAgencyById(Long aid);

    /* 声明添加房屋机构 */
    void saveAgency(Agency agency);

    /* 声明更新房屋机构 */
    void updateAgency(Agency agency);

    /* 声明通过主键删除房屋机构 */
    void deleteAgencyById(Long aid);
}
