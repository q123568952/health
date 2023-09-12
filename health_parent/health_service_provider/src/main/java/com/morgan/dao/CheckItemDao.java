package com.morgan.dao;


import java.util.List;

import com.github.pagehelper.Page;

import com.morgan.pojo.CheckItem;

public interface CheckItemDao {

    public void add(CheckItem CheckItem);

    public Page<CheckItem> selectByCondition(String queryString);

    public long findCountByCheckItemId(Integer id);

    public void deleteById(Integer id);

    public CheckItem selectById(Integer id);

    public void edit(CheckItem checkItem);

    public List<CheckItem> findAll();

}
