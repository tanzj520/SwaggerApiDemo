package com.ktnw.management.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel("test 对象")
public class Test implements Serializable{

    @ApiModelProperty(value = "名称",dataType = "String")
    private String name;

    @ApiModelProperty(value = "描述",dataType = "String")
    private String description;

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
}
