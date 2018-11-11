package cn.xt.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// @RestController 以JSON格式返回数据
@RestController
public class MyController {

    // 请求名为：sayHello
    // 请求方式为：get
    @RequestMapping(value = "sayHello", method = RequestMethod.GET)
    public String sayHello() {
        return "hello world";
    }
}
