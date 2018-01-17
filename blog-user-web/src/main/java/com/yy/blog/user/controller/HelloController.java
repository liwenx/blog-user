package com.yy.blog.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liwenxing
 * @date 2018/1/17 15:43
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello () {
        return "I am blog user";
    }
}
