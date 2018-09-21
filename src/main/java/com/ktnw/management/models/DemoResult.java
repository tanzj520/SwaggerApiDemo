package com.ktnw.management.models;

import com.ktnw.management.entity.Demo;
import com.ktnw.management.util.ResultUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "demo对象返回",parent = ResultUtil.class)
public class DemoResult extends ResultUtil implements Serializable {

    @ApiModelProperty(value = "demo信息",dataType = "Map")
    private Demo result;

    public Demo getResult() {
        return result;
    }

    public void setResult(Demo result) {
        this.result = result;
    }
}
