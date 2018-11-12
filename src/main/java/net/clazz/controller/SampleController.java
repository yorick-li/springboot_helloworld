package net.clazz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 配置详解：@RestController
 * @author yorick
 * @date 2018/11/12 下午9:18
 */

//@RestController 等同于下面2个注解加起来的效果
@Controller
@ResponseBody
public class SampleController {

    @RequestMapping("/test")
//    @ResponseBody
    public Map<String, String> test() {
        Map<String, String> map = new HashMap<>(1);
        map.put("name", "yorick");
        return map;
    }

}
