package com.ktnw.management.models;

import com.ktnw.management.entity.Demo;
import com.ktnw.management.util.PageUtil;
import com.ktnw.management.util.ResultUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "demo分页信息",parent = ResultUtil.class)
public class DemoPageResult extends ResultUtil {

    @ApiModelProperty(value = "数据列表",dataType = "List")
    private PageUtil<Demo> result;

    public PageUtil<Demo> getResult() {
        return result;
    }

    public void setResult(PageUtil<Demo> result) {
        this.result = result;
    }
}
