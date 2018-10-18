package com.znlccy.house.common.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-15:07
 * @Version: v1.0.0
 * @Comment: 权限实体类
 */

@Entity
@Table(name = "tb_permission")
public class Permission implements Serializable {

    /* 声明权限主键 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pid", columnDefinition = "bigint(20) comment '权限主键'")
    private Long pid;

    /* 声明权限名称 */
    @Column(name = "name", columnDefinition = "varchar(255) default '' comment '权限名称'", nullable = false)
    private String name;

    /* 实现获取权限主键 */
    public Long getPid() {
        return pid;
    }

    /* 实现设置权限主键 */
    public void setPid(Long pid) {
        this.pid = pid;
    }

    /* 实现获取权限名称 */
    public String getName() {
        return name;
    }

    /* 实现设置权限名称 */
    public void setName(String name) {
        this.name = name;
    }
}
