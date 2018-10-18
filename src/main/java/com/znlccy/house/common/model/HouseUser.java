package com.znlccy.house.common.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-11:23
 * @Version: v1.0.0
 * @Comment: 
 */

@Entity
@Table(name = "tb_house_user")
public class HouseUser implements Serializable {

    /* 声明房屋用户主键 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "huid", columnDefinition = "bigint(20) comment '房屋用户主键'")
    private Long huid;

    /* 声明房屋主键 */
    @Column(name = "house_id", columnDefinition = "bigint(20) default 0 comment '房屋主键'", nullable = false)
    private Long houseId;

    /* 声明用户主键 */
    @Column(name = "user_id", columnDefinition = "bigint(20) default 0 comment '用户主键'", nullable = false)
    private Long userId;

    /* 声明房屋用户类型 1:售卖  2:收藏 */
    @Column(name = "type", columnDefinition = "tinyint(1) default 0 comment '房屋用户类型，1:售卖 2:收藏'", nullable = false)
    private Short type;

    /* 声明房屋用户创建时间 */
    @Column(name = "create_time", columnDefinition = "datetime comment '创建时间'", nullable = false)
    private Date createTime;

    /* 声明房屋用户更新时间 */
    @Column(name = "update_time", columnDefinition = "datetime comment '更新时间'", nullable = false)
    private Date updateTime;

    /* 实现获取房屋用户主键 */
    public Long getHuid() {
        return huid;
    }

    /* 实现设置房屋用户主键 */
    public void setHuid(Long huid) {
        this.huid = huid;
    }

    /* 实现获取房屋主键 */
    public Long getHouseId() {
        return houseId;
    }

    /* 实现设置房屋主键 */
    public void setHouseId(Long houseId) {
        this.houseId = houseId;
    }

    /* 实现获取用户主键 */
    public Long getUserId() {
        return userId;
    }

    /* 实现设置用户主键 */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /* 实现获取房屋用户类型 */
    public Short getType() {
        return type;
    }

    /* 实现设置房屋用户类型 */
    public void setType(Short type) {
        this.type = type;
    }

    /* 实现获取房屋用户创建时间 */
    public Date getCreateTime() {
        return createTime;
    }

    /* 实现设置房屋用户创建时间 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /* 实现获取房屋用户更新时间 */
    public Date getUpdateTime() {
        return updateTime;
    }

    /* 实现设置房屋用户更新时间 */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
