package com.morgan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.morgan.dao.CheckItemDao;
import com.morgan.entity.PageResult;
import com.morgan.entity.QueryPageBean;
import com.morgan.pojo.CheckItem;
import com.morgan.service.CheckItemService;

// 檢查項服務

@Service(interfaceClass = CheckItemService.class)
@Transactional
public class CheckItemServiceImpl implements CheckItemService{


    @Autowired
    private CheckItemDao checkItemDao;

    @Override
    public void add(CheckItem CheckItem) {
        checkItemDao.add(CheckItem);
    }

    @Override
    public PageResult findPage(QueryPageBean queryPageBean) {
        Integer currentPge =queryPageBean.getCurrentPage();
        Integer pageSize =queryPageBean.getPageSize();
        String queryString=queryPageBean.getQueryString();
        PageHelper.startPage(currentPge, pageSize);
        // 用Mybatis分頁查詢插件
        PageHelper.startPage(currentPge, pageSize);
        Page<CheckItem> pages = checkItemDao.selectByCondition(queryString);
        long total = pages.getTotal();
        List<CheckItem> rows = pages.getResult();
         return new PageResult(total, rows);
    }

    @Override
    public void deleteById(Integer id) {
        long count =checkItemDao.findCountByCheckItemId(id);
        if (count > 0){
            // 當前檢查項已經被關聯
            new RuntimeException();
        }
        checkItemDao.deleteById(id);
    }

    @Override
    public CheckItem findById(Integer id) {
        CheckItem checkItem= checkItemDao.selectById(id);
        return checkItem;
    }

    @Override
    public void edit(CheckItem checkItem) {
        checkItemDao.edit(checkItem);
    }

    @Override
    public List<CheckItem> findAll() {
        List<CheckItem> checkItems = checkItemDao.findAll();
        return checkItems;

    }


    
}
