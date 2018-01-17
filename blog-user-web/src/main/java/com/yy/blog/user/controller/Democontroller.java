package com.yy.blog.user.controller;

import com.yy.blog.user.domain.DemoUser;
import com.yy.blog.user.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liwenxing
 * @date 2018/1/17 16:19
 */
@RestController
public class Democontroller {
    @Autowired
    private DemoService demoService;

    @RequestMapping("/demo/insert")
    public String insertUser () {
        return null;
    }
    @RequestMapping("/demo/findUser")
    public String findUser(String name) {
        return demoService.findByName(name).toString();
    }
}
