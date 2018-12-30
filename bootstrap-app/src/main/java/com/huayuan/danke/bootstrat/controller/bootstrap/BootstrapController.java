package com.huayuan.danke.bootstrat.controller.bootstrap;

import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Api(value = "文件处理", description = "检查模板操作")
@Controller
@RequestMapping("/index")
public class BootstrapController {

    @ApiOperation(value = "首页", notes = "引导")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="path",name="username",dataType="String",required=true,value="用户的姓名",defaultValue="thuempire"),
            @ApiImplicitParam(paramType="path",name="password",dataType="String",required=true,value="用户的密码",defaultValue="123456")
    })
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @GetMapping(value = "/index")
    public String index() {
        return "index";
    }
}
