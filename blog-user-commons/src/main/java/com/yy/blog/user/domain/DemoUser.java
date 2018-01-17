package com.yy.blog.user.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author liwenxing
 * @date 2018/1/17 16:39
 */
@Entity
@Table(name = "demo_user")
public class DemoUser {
    //主键
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "id")
    private String id;
    //名称
    private String name;
    //密码
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "DemoUser{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
