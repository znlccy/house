package com.znlccy.house.common.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-15:06
 * @Version: v1.0.0
 * @Comment: 角色实体类
 */

@Entity
@Table(name = "tb_role")
public class Role implements Serializable {

    /* 声明角色主键 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rid", columnDefinition = "bigint(20) comment '角色主键'")
    private Long rid;

    /* 声明角色名称 */
    @Column(name = "name", columnDefinition = "varchar(255) default '' comment '角色名称'", nullable = false)
    private String name;

    /* 实现获取角色主键 */
    public Long getRid() {
        return rid;
    }

    /* 实现设置角色主键 */
    public void setRid(Long rid) {
        this.rid = rid;
    }

    /* 实现获取角色名称 */
    public String getName() {
        return name;
    }

    /* 实现设置角色名称 */
    public void setName(String name) {
        this.name = name;
    }
}
