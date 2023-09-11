package com.morgan.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.morgan.constant.MessageConstant;
import com.morgan.entity.PageResult;
import com.morgan.entity.QueryPageBean;
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
        return new Result(true, MessageConstant.ADD_CHECKITEM_SUCCESS);

    }

    @RequestMapping("/findPage")
    public PageResult findPage(@RequestBody QueryPageBean queryPageBean){
       
            PageResult pageResult = checkItemService.findPage(queryPageBean);
            return pageResult;
    }
    @RequestMapping("/delete")
    public Result delete(Integer id){
            try{
            checkItemService.deleteById(id);
        } catch (Exception e){
            e.printStackTrace();
            return new Result(false, MessageConstant.DELETE_CHECKITEM_FAIL);
        }
        return new Result(true, MessageConstant.DELETE_CHECKITEM_SUCCESS);
            
    }
}
