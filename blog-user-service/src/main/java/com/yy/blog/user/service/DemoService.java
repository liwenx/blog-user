package com.yy.blog.user.service;

import com.yy.blog.user.domain.DemoUser;

/**
 * @author liwenxing
 * @date 2018/1/17 16:12
 */
public interface DemoService {

    public DemoUser findByName (String name);

}
