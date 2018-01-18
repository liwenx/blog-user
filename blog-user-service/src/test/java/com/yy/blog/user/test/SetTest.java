package com.yy.blog.user.test;

import com.yy.blog.user.domain.DemoUser;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author liwenxing
 * @date 2018/1/18 9:29
 */
public class SetTest {
    @Test
    public void setTest1() {
        DemoUser demoUser1 = new DemoUser();
        demoUser1.setId("lll");
        demoUser1.setName("www");
        DemoUser demoUser2 = new DemoUser();
        demoUser2.setId("lll");
        demoUser2.setName("www");
        List<DemoUser> demoUserList = new ArrayList<>();
        demoUserList.add(demoUser1);
        demoUserList.add(demoUser2);
        Set<DemoUser> demoUserSet = new HashSet<>();
//        demoUserSet.addAll()
        for (DemoUser demoUser : demoUserList) {
            demoUserSet.add(demoUser);
        }
        System.out.println(demoUserSet.size());
    }
}
