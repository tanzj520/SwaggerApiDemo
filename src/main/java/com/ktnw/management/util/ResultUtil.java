package com.ktnw.management.util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel("api接口通用返回对象")
public class ResultUtil implements Serializable{

    @ApiModelProperty(value = "返回码",dataType = "int")
    private int code;

    @ApiModelProperty(value = "错误信息",dataType = "String")
    private String msg;

    @ApiModelProperty(value = "api版本",dataType = "String")
    private String version;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
