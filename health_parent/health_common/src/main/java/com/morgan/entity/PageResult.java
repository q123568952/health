package com.morgan.entity;

import java.io.Serializable;
import java.util.List;
// page result
public class PageResult implements Serializable{
    private Long total; //總頁數
    private List rows;//當前頁面結果
    public PageResult(Long total, List rows) {
        super();
        this.total = total;
        this.rows = rows;
    }
    public Long getTotal() {
        return total;
    }
    public void setTotal(Long total) {
        this.total = total;
    }
    public List getRows() {
        return rows;
    }
    public void setRows(List rows) {
        this.rows = rows;
    }
}
