package com.morgan.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.morgan.pojo.CheckItem;
import com.morgan.service.CheckItemService;

// 檢查項服務

@Service
@Transactional
public class CheckItemServiceImpl implements CheckItemService{



    @Override
    public void add(CheckItem CheckItem) {
        
    }
    
}
