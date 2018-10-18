package com.znlccy.house.common.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessorOrder;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: Administrator
 * @Datetime: 2018/10/18-12:07
 * @Version: v1.0.0
 * @Comment: 博客实体类
 */
@Entity
@Table(name = "tb_blog")
public class Blog implements Serializable {

    /* 声明博客主键 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bid", columnDefinition = "bigint(20) comment '博客主键'")
    private Long bid;

    /* 声明博客标题 */
    @Column(name = "title", columnDefinition = "varchar(255) default '' comment '博客标题'", nullable = false)
    private String title;

    /* 声明博客内容 */
    @Column(name = "content", columnDefinition = "text comment '博客内容'", nullable = false)
    private String content;

    /* 声明博客标签 */
    @Column(name = "tags", columnDefinition = "varchar(512) default '' comment '博客标签'", nullable = false)
    private String tags;

    /* 声明博客分类 1:准备买房 2:看房/选房 3:签约/订房 4:全款/贷款 5:交税/过户 6:入住/交接 7:买房风险 */
    @Column(name = "category", columnDefinition = "int(8) default 0 comment '博客分类 1:准备买房 2:看房/选房 3:签约/订房 4:全款/贷款 5:交税/过户 6:入住/交接 7:买房风险'", nullable = false)
    private Integer category;

    /* 声明博客创建时间 */
    @Column(name = "create_time", columnDefinition = "datetime comment '博客创建时间'", nullable = false)
    private Date createTime;

    /* 声明博客更新时间 */
    @Column(name = "update_time", columnDefinition = "datetime comment '博客更新时间'", nullable = false)
    private Date updateTime;

    /* 实现获取博客主键 */
    public Long getBid() {
        return bid;
    }

    /* 实现设置博客主键 */
    public void setBid(Long bid) {
        this.bid = bid;
    }

    /* 实现获取博客标题 */
    public String getTitle() {
        return title;
    }

    /* 实现设置博客标题 */
    public void setTitle(String title) {
        this.title = title;
    }

    /* 实现获取博客内容 */
    public String getContent() {
        return content;
    }

    /* 实现设置博客内容 */
    public void setContent(String content) {
        this.content = content;
    }

    /* 实现获取博客标签 */
    public String getTags() {
        return tags;
    }

    /* 实现设置博客标签 */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /* 实现获取博客分类 */
    public Integer getCategory() {
        return category;
    }

    /* 实现设置博客分类 */
    public void setCategory(Integer category) {
        this.category = category;
    }

    /* 实现获取博客创建时间 */
    public Date getCreateTime() {
        return createTime;
    }

    /* 实现设置博客创建时间 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /* 实现获取博客更新时间 */
    public Date getUpdateTime() {
        return updateTime;
    }

    /* 实现设置博客更新时间 */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
