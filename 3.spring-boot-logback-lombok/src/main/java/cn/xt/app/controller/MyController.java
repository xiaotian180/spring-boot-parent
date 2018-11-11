package cn.xt.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// @RestController 以JSON格式返回数据
@RestController
public class MyController {

    Logger log = LoggerFactory.getLogger(MyController.class);

    // 请求名为：sayHello
    // 请求方式为：get
    @RequestMapping(value = "sayHello", method = RequestMethod.GET)
    public String sayHello() {
        log.info("info");
        log.debug("debug");
        log.error("error");
        log.warn("warn");
        return "hello world";
    }
}
