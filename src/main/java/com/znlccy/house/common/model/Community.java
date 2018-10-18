package com.znlccy.house.common.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-11:02
 * @Version: v1.0.0
 * @Comment: 小区实体类
 */

@Entity
@Table(name = "tb_community")
public class Community implements Serializable {

    /* 声明小区主键 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cid", columnDefinition = "bigint(20) comment '小区主键'")
    private Long cid;

    /* 声明小区城市编码 */
    @Column(name = "city_code", columnDefinition = "varchar(12) default '' comment '城市编码'", nullable = false)
    private String cityCode;

    /* 声明小区名称 */
    @Column(name = "name", columnDefinition = "varchar(12) default '' comment '小区名称'", nullable = false)
    private String name;

    /* 声明小区城市名称 */
    @Column(name = "city_name", columnDefinition = "varchar(12) default '' comment '城市名称'", nullable = false)
    private String cityName;

    /* 实现获取小区主键 */
    public Long getCid() {
        return cid;
    }

    /* 实现设置小区主键 */
    public void setCid(Long cid) {
        this.cid = cid;
    }

    /* 实现获取小区城市编码 */
    public String getCityCode() {
        return cityCode;
    }

    /* 实现设置小区城市编码 */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /* 实现获取小区名称 */
    public String getName() {
        return name;
    }

    /* 实现设置小区名称 */
    public void setName(String name) {
        this.name = name;
    }

    /* 实现获取小区城市名称 */
    public String getCityName() {
        return cityName;
    }

    /* 实现设置小区城市名称 */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
