package cn.xt.app.controller;

import cn.xt.app.request.UserLoginRequest;
import cn.xt.app.response.UserLoginResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// @RestController 以JSON格式返回数据
@RestController
@Api(tags = "我的Controller层")
public class MyController {

    // 请求名为：sayHello
    // 请求方式为：get
    @RequestMapping(value = "sayHello", method = RequestMethod.GET)
    @ApiOperation(value = "接口说明", notes = "接口发布说明")
    public String sayHello() {
        return "hello world";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ApiOperation(value = "登录接口说明", notes = "登录接口发布说明")
    public UserLoginResponse login(@RequestBody UserLoginRequest request) {
        UserLoginResponse response = new UserLoginResponse();
        response.setCode("200");
        response.setMessage("登录成功 --> userId: " + request.getUserId()
                + " pwd: " + request.getPassword()
                + " validateCode: " + request.getValidateCode());
        return response;
    }
}
