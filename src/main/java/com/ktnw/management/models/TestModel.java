package com.ktnw.management.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("test 组合对象")
public class TestModel {

    @ApiModelProperty(value = "test1",dataType = "Map")
    private Test test1;

    @ApiModelProperty(value = "test2",dataType = "Map")
    private Test test2;

    public Test getTest1() {
        return test1;
    }

    public void setTest1(Test test1) {
        this.test1 = test1;
    }

    public Test getTest2() {
        return test2;
    }

    public void setTest2(Test test2) {
        this.test2 = test2;
    }
}
