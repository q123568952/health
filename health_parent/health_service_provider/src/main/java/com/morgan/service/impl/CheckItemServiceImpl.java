package com.morgan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.morgan.dao.CheckItemDao;
import com.morgan.pojo.CheckItem;
import com.morgan.service.CheckItemService;

// 檢查項服務

@Service
@Transactional
public class CheckItemServiceImpl implements CheckItemService{


    @Autowired
    private CheckItemDao checkItemDao;

    @Override
    public void add(CheckItem CheckItem) {
        checkItemDao.add(CheckItem);
    }
    
}
