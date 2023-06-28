package com.example.scs_springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 蛋宝
 * @date: 2023/6/28 9:36
 * @description:
 */

@RestController

public class LoginController {
    @RequestMapping("/login")
    public String name(@RequestParam(value = "user") String name, String pwd) {
        if (name.equals("ldd")&&pwd.equals("123456")) {
            return "hello" + name;
        } else {
            return "登录失败";
        }
    }
}