package com.example.scs_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: 蛋宝
 * @date: 2023/6/27 16:14
 * @description:
 */

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "helloworld";
    }

    @RequestMapping("/hello1")
    public String hello1() {
        return "http://pic-ldd-test.oss-cn-hangzhou.aliyuncs.com/avatar/EABB9EEE1100F0D0061E0CBC81D9332F.jpg";
    }

    @RequestMapping("/hello2")
    public String hello2() {
        return "/img/index.html";
    }
}