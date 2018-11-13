package com.znlccy.house.common.page;

/**
 * @Author: Administrator
 * @Datetime: 2018/11/9-10:22
 * @Version: v1.0.0
 * @Comment: 分页参数
 */

public class PageParams {

    /* 声明每页显示多少条 */
    private static final Integer PAGE_SIZE = 5;

    /* 声明每页显示多少条 */
    private Integer pageSize;

    /* 声明跳转页 */
    private Integer pageNum;

    /* 声明偏移量 */
    private Integer offset;

    /* 声明筛选出几条 */
    private Integer limit;

    /* 声明构造函数 */
    public static PageParams build(Integer pageSize, Integer pageNum) {
        if (pageSize == null) {
            pageSize = PAGE_SIZE;
        }
        if (pageNum == null) {
            pageNum = 1;
        }
        return new PageParams(pageSize, pageNum);
    }

    /* 声明默认不带参数构造函数 */
    public PageParams() {
        this(PAGE_SIZE, 1);
    }

    /* 声明带有参数构造函数 */
    public PageParams(Integer pageSize, Integer pageNum) {
        this.pageSize = pageSize;
        this.pageNum = pageNum;
        this.offset = pageSize * (pageNum - 1);
        this.limit = pageSize;
    }

    /* 获取每页数 */
    public static Integer getPageSize() {
        return PAGE_SIZE;
    }

    /* 设置每页数 */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

     /* 获取跳转页 */
    public Integer getPageNum() {
        return pageNum;
    }

    /* 设置跳转页 */
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    /* 获取偏移量 */
    public Integer getOffset() {
        return offset;
    }

    /* 设置偏移量 */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /* 获取筛选数 */
    public Integer getLimit() {
        return limit;
    }

    /* 设置筛选数 */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
