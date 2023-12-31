package com.morgan.pojo;

import java.io.Serializable;
import java.util.List;

public class CheckGroup implements Serializable{
    private Integer id;
    private String code;
    private String name;
    private String helpCode;
    private String sex;
    private String remark;
    private String attention;
    private List<CheckItem> checkItem;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getHelpCode() {
        return helpCode;
    }
    public void setHelpCode(String helpCode) {
        this.helpCode = helpCode;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getAttention() {
        return attention;
    }
    public void setAttention(String attention) {
        this.attention = attention;
    }
    public List<CheckItem> getCheckItem() {
        return checkItem;
    }
    public void setCheckItem(List<CheckItem> checkItem) {
        this.checkItem = checkItem;
    }

}
