package net.clazz.entity;


import com.fasterxml.jackson.annotation.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author yorick
 * @date 2018/11/13 下午9:41
 */

@Getter
@Setter
@NoArgsConstructor
public class User {

    /**
     * 序列化时,为此字段设置别名
     */
    @JsonProperty("account")
    private Long id;

    /**
     * 序列化时,若此字段为null, 不返回此字段
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;

    private int age;

    /**
     * 序列化时,按照指定格式，格式化此字段
     */
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss", locale="zh", timezone="GMT+8")
    private Date createTime;

    /**
     * 序列化时不返回此字段
     */
    @JsonIgnore
    private String pwd;

    public User(Long id, String name, int age, Date createTime, String pwd) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.createTime = createTime;
        this.pwd = pwd;
    }
}
