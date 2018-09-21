package com.ktnw.management.controllers;

import com.ktnw.management.models.DemoPageResult;
import com.ktnw.management.models.DemoResult;
import com.ktnw.management.models.Test;
import com.ktnw.management.models.TestModel;
import com.ktnw.management.util.ResultUtil;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "demo管理",description = "demo管理")
@RestController
@RequestMapping("demo")
public class DemoController {

    @ApiOperation(value = "getDemo",notes = "查询demo",httpMethod = "GET",response = DemoResult.class,responseContainer = "Map")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "accessToken", value = "登录令牌", dataType = "String",paramType = "header"),
            @ApiImplicitParam(name = "demoId", value = "demo id", dataType = "int",paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 500,response = ResultUtil.class,message = "服务器内部错误"),
            @ApiResponse(code = 400,response = ResultUtil.class,message = "参数错误"),
            @ApiResponse(code = 401,response = ResultUtil.class,message = "无访问权限"),
            @ApiResponse(code = 404,response = ResultUtil.class,message = "地址不存在")
    })
    @RequestMapping(value = "getDemo",method = RequestMethod.GET)
    public ResultUtil getDemo(int demoId){
        return new DemoResult();
    }

    @ApiOperation(value = "listDemo",notes = "查询demo",httpMethod = "POST",response = DemoPageResult.class,responseContainer = "Map")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "accessToken", value = "登录令牌", dataType = "String",paramType = "header")
    })
    @ApiResponses({
            @ApiResponse(code = 500,response = ResultUtil.class,message = "服务器内部错误"),
            @ApiResponse(code = 400,response = ResultUtil.class,message = "参数错误"),
            @ApiResponse(code = 401,response = ResultUtil.class,message = "无访问权限"),
            @ApiResponse(code = 404,response = ResultUtil.class,message = "地址不存在")
    })
    @RequestMapping(value = "listDemo",method = RequestMethod.POST)
    public ResultUtil listDemo(TestModel testModel){
        return new DemoPageResult();
    }

    @ApiOperation(value = "listDemo1",notes = "查询demo1",httpMethod = "POST",response = DemoPageResult.class,responseContainer = "Map")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "accessToken", value = "登录令牌", dataType = "String",paramType = "header")
    })
    @ApiResponses({
            @ApiResponse(code = 500,response = ResultUtil.class,message = "服务器内部错误"),
            @ApiResponse(code = 400,response = ResultUtil.class,message = "参数错误"),
            @ApiResponse(code = 401,response = ResultUtil.class,message = "无访问权限"),
            @ApiResponse(code = 404,response = ResultUtil.class,message = "地址不存在")
    })
    @RequestMapping(value = "listDemo1",method = RequestMethod.POST)
    public ResultUtil listDemo1(Test test){
        return new DemoPageResult();
    }
}
