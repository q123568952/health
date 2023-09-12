package com.morgan.service;


import com.morgan.entity.PageResult;
import com.morgan.entity.QueryPageBean;
import com.morgan.pojo.CheckItem;

// CheckItem服務接口
public interface CheckItemService {
    public void add(CheckItem CheckItem);
    public PageResult findPage(QueryPageBean queryPageBean);
    public void deleteById(Integer id);
    public CheckItem findById(Integer id);
    public void edit(CheckItem checkItem);
}
