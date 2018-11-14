package net.clazz.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author yorick
 * @date 2018/11/13 下午9:41
 */

@Getter
@Setter
@NoArgsConstructor
public class User {

    private Long id;

    private String name;

    private int age;

}
