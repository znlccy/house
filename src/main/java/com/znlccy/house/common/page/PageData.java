package com.znlccy.house.common.page;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/11/9-10:01
 * @Version: v1.0.0
 * @Comment: 分页数据
 */
public class PageData<T> {

    /* 声明分页列表 */
    private List<T> list;

    /* 声明分页pageNum,pageSize,page list */
    private Pagination pagination;

    /* 声明默认构造函数 */
    public PageData(Pagination pagination, List<T> list) {
        this.pagination = pagination;
        this.list = list;
    }

    /* 获取列表 */
    public List<T> getList() {
        return list;
    }

    /* 设置列表 */
    public void setList(List<T> list) {
        this.list = list;
    }

    /* 获取分页 */
    public Pagination getPagination() {
        return pagination;
    }

    /* 设置分页 */
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    /* 绑定分页 */
    public static <T> PageData<T> buildPage(List<T> list,Long count,Integer pageSize,Integer pageNum) {
        Pagination _pagination = new Pagination(pageSize, pageNum, count);
        return new PageData<>(_pagination, list);
    }
}
