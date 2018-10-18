package com.znlccy.house.common.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-14:20
 * @Version: v1.0.0
 * @Comment: 房屋信息实体类
 */

@Entity
@Table(name = "tb_house_message")
public class HouseMessage implements Serializable {

    /* 声明房屋消息主键 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hmid", columnDefinition = "bigint comment '房屋消息主键'")
    private Long hmid;

    /* 声明房屋消息 */
    @Column(name = "message", columnDefinition = "varchar(512) default '' comment '房屋消息'", nullable = false)
    private String message;

    /* 声明房屋机构主键 */
    @Column(name = "agent_id", columnDefinition = "bigint(20) default 0 comment '房屋经纪机构主键'", nullable = false)
    private Long agentId;

    /* 声明房屋主键 */
    @Column(name = "house_id", columnDefinition = "bigint(20) default 0 comment '房屋主键'", nullable = false)
    private Long houseId;

    /* 声明房屋用户名 */
    @Column(name = "username", columnDefinition = "varchar(40) default '' comment '用户名'", nullable = false)
    private String username;

    /* 声明房屋创建时间 */
    @Column(name = "create_time", columnDefinition = "datetime comment '创建时间'", nullable = false)
    private Date createTime;

    /* 声明房屋更新时间 */
    @Column(name = "update_time", columnDefinition = "datetime comment '更新时间'", nullable = false)
    private Date updateTime;

    /* 实现获取房屋消息主键 */
    public Long getHmid() {
        return hmid;
    }

    /* 实现设置房屋消息主键 */
    public void setHmid(Long hmid) {
        this.hmid = hmid;
    }

    /* 实现获取房屋消息 */
    public String getMessage() {
        return message;
    }

    /* 实现设置房屋消息 */
    public void setMessage(String message) {
        this.message = message;
    }

    /* 实现获取房屋经纪机构 */
    public Long getAgentId() {
        return agentId;
    }

    /* 实现设置房屋经纪机构 */
    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    /* 实现获取房屋主键 */
    public Long getHouseId() {
        return houseId;
    }

    /* 实现设置房屋主键 */
    public void setHouseId(Long houseId) {
        this.houseId = houseId;
    }

    /* 实现获取用户名 */
    public String getUsername() {
        return username;
    }

    /* 实现设置用户名 */
    public void setUsername(String username) {
        this.username = username;
    }

    /* 实现获取创建时间 */
    public Date getCreateTime() {
        return createTime;
    }

    /* 实现设置创建时间 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /* 实现获取更新时间 */
    public Date getUpdateTime() {
        return updateTime;
    }

    /* 实现设置更新时间 */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
