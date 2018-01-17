package com.yy.blog.user.domain;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**引入lombok插件，通过注解实现getter setter toString equals hashCode
 * @author liwenxing
 * @date 2018/1/17 16:39
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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
}
