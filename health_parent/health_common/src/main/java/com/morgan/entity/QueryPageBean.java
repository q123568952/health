package com.morgan.entity;

import java.io.Serializable;
// pack query condition
public class QueryPageBean implements Serializable{
    private Integer currentPage;//頁碼
    private Integer pageSize;//每頁筆數
    private String queryString;//查詢條件

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }
}
