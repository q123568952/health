package com.morgan.dao;


import com.github.pagehelper.Page;

import com.morgan.pojo.CheckItem;

public interface CheckItemDao {

    public void add(CheckItem CheckItem);

    public Page<CheckItem> selectByCondition(String queryString);

}
