package com.morgan.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.morgan.entity.Result;
import com.morgan.pojo.CheckItem;

// 檢查項管理
@RestController
@RequestMapping("/checkitem")
public class CheckItemController {

    

    @RequestMapping("/add")
    public Result add(@RequestBody CheckItem checkItem){

       

        return null;

    }
    
}
