package com.yy.blog.user.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**引入lombok插件，通过注解实现getter setter toString equals hashCode
 * equals hashCode重写
 * @author liwenxing
 * @date 2018/1/17 16:39
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "demo_user")
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
}
