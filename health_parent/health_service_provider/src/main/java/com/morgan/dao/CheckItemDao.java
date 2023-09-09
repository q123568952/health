package com.morgan.dao;

import org.apache.ibatis.annotations.Mapper;

import com.morgan.pojo.CheckItem;

public interface CheckItemDao {

    public void add(CheckItem CheckItem);

}
