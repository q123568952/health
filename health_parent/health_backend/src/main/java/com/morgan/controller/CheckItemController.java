package com.morgan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.morgan.constant.MessageConstant;
import com.morgan.entity.Result;
import com.morgan.pojo.CheckItem;
import com.morgan.service.CheckItemService;

// 檢查項管理
@RestController
@RequestMapping("/checkitem")
public class CheckItemController {

    // 查找服務
    @Reference
    private CheckItemService checkItemService;

    @RequestMapping("/add")
    public Result add(@RequestBody CheckItem checkItem){
        try{
            checkItemService.add(checkItem);
        } catch (Exception e){
            e.printStackTrace();
            return new Result(false, MessageConstant.ADD_CHECKITEM_FAIL);
        }
        return new Result(false, MessageConstant.ADD_CHECKITEM_SUCCESS);

    }
    
}