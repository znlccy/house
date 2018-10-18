package com.znlccy.house.common.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-11:49
 * @Version: v1.0.0
 * @Comment: 评论实体类
 */

@Entity
@Table(name = "tb_comment")
public class Comment implements Serializable {

    /* 声明评论主键 */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cid", columnDefinition = "bigint(20) comment '评论主键'")
    private Long cid;

    /* 声明评论内容 */
    @Column(name = "content", columnDefinition = "text comment '评论内容'", nullable = false)
    private String content;

    /* 声明评论房屋 */
    @Column(name = "house_id", columnDefinition = "bigint(20) default 0 comment '房屋主键'",nullable = false)
    private Long houseId;

    /* 声明评论博客 */
    @Column(name = "blog_id", columnDefinition = "bigint(20) default 0 comment '博客主键'", nullable = false)
    private Long blogId;

    /* 声明评论用户 */
    @Column(name = "user_id", columnDefinition = "bigint(20) default 0 comment '用户主键'", nullable = false)
    private Long userId;

    /* 声明评论类型 1:房屋评论 2:博客评论 */
    @Column(name = "type", columnDefinition = "tinyint(1) default 0 comment '评论类型 1:房屋评论 2:博客评论'", nullable = false)
    private Short type;

    /* 声明评论创建时间 */
    @Column(name = "create_time", columnDefinition = "datetime comment '评论创建时间'", nullable = false)
    private Date createTime;

    /* 声明评论更新时间 */
    @Column(name = "update_time", columnDefinition = "datetime comment '评论更新时间'", nullable = false)
    private Date updateTime;

    /* 实现获取评论主键 */
    public Long getCid() {
        return cid;
    }

    /* 实现设置评论主键 */
    public void setCid(Long cid) {
        this.cid = cid;
    }

    /* 实现获取评论内容 */
    public String getContent() {
        return content;
    }

    /* 实现设置评论内容 */
    public void setContent(String content) {
        this.content = content;
    }

    /* 实现获取房屋主键 */
    public Long getHouseId() {
        return houseId;
    }

    /* 实现设置房屋主键 */
    public void setHouseId(Long houseId) {
        this.houseId = houseId;
    }

    /* 实现获取博客主键 */
    public Long getBlogId() {
        return blogId;
    }

    /* 实现设置博客主键 */
    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    /* 实现获取用户主键 */
    public Long getUserId() {
        return userId;
    }

    /* 实现设置用户主键 */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /* 实现获取评论类型 */
    public Short getType() {
        return type;
    }

    /* 实现设置评论类型 */
    public void setType(Short type) {
        this.type = type;
    }

    /* 实现获取评论创建时间 */
    public Date getCreateTime() {
        return createTime;
    }

    /* 实现设置评论创建时间 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /* 实现获取评论更新时间 */
    public Date getUpdateTime() {
        return updateTime;
    }

    /* 实现设置评论更新时间 */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
