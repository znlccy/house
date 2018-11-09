package com.znlccy.house.common.page;

/**
 * @Author: Administrator
 * @Datetime: 2018/11/9-10:22
 * @Version: v1.0.0
 * @Comment: 分页参数
 */

public class PageParams {

    private static final Integer PAGE_SIZE = 5;

    private Integer pageSize;

    private Integer pageNum;

    private Integer offset;

    private Integer limit;

    public PageParams() {
        super();
    }

    public static Integer getPageSize() {
        return PAGE_SIZE;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
