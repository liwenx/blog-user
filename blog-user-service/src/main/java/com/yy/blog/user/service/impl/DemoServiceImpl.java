package com.yy.blog.user.service.impl;

import com.yy.blog.user.dao.DemoDao;
import com.yy.blog.user.domain.DemoUser;
import com.yy.blog.user.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liwenxing
 * @date 2018/1/17 16:16
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService{

    private final DemoDao demoDao;
    @Autowired
    public DemoServiceImpl (DemoDao demoDao) {
           this.demoDao = demoDao;
    }
    @Override
    public DemoUser findByName(String name) {
        return demoDao.findByName(name);
    }
}
