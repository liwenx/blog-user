package com.yy.blog.user.dao;

import com.yy.blog.user.domain.DemoUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @author liwenxing
 * @date 2018/1/17 16:31
 */
@Repository
public interface DemoDao  extends JpaRepository<DemoUser, Serializable>{

    /**
     * 查找用户
     * @param name
     * @return
     */
    DemoUser findByName(String name);
}
