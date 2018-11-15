package net.clazz.controller;

import net.clazz.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 测试 jackson 框架
 * @author yorick
 * @date 2018/11/15 下午9:32
 */

@RestController
public class JsonController {

    @GetMapping("/v1/test_json")
    public User testJson() {
//        return new User(1000L, "yorick", 23, new Date(), "1231");
        return new User(1000L, null, 23, new Date(), "1231");
    }

}
