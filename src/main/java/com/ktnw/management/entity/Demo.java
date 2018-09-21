package com.ktnw.management.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

@ApiModel("demo对象信息")
public class Demo implements Serializable {

    @ApiModelProperty(value = "demo id",dataType = "int")
    private int id;

    @ApiModelProperty(value = "名称",dataType = "String")
    private String name;

    @ApiModelProperty(value = "描述",dataType = "String")
    private String description;

    @ApiModelProperty(value = "地址",dataType = "String")
    private String address;

    @ApiModelProperty(value = "创建时间",dataType = "Date")
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
