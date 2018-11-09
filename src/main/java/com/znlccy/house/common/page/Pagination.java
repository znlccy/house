package com.znlccy.house.common.page;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/11/9-10:07
 * @Version: v1.0.0
 * @Comment: 分页功能
 */
public class Pagination {

    /* 声明每页多少条 */
    private int pageSize;

    /* 声明跳转至第几页 */
    private int pageNum;

    /* 声明总的记录数 */
    private long totalCount;

    /* 声明分页数量 */
    private List<Integer> pages = Lists.newArrayList();

    /* 声明默认构造函数 */
    public Pagination(Integer pageSize, Integer pageNum, Long totalCount) {
        this.pageSize = pageSize;
        this.pageNum = pageNum;
        this.totalCount = totalCount;
        for (int i = 1; i <= pageNum; i++) {
            pages.add(i);
        }
        Long pageCount = totalCount/pageSize + ((totalCount % pageSize == 0)? 0:1);
        if (pageCount > pageNum) {
            for (int i = pageNum + 1; i <= pageCount; i++) {
                pages.add(i);
            }
        }
    }

    /* 获取每页多少条 */
    public int getPageSize() {
        return pageSize;
    }

    /* 设置每页多少条 */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /* 获取跳转页 */
    public int getPageNum() {
        return pageNum;
    }

    /* 设置跳转页 */
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    /* 获取总记录数 */
    public long getTotalCount() {
        return totalCount;
    }

    /* 设置总记录数 */
    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    /* 获取分页数 */
    public List<Integer> getPages() {
        return pages;
    }

    /* 设置分页数 */
    public void setPages(List<Integer> pages) {
        this.pages = pages;
    }
}
