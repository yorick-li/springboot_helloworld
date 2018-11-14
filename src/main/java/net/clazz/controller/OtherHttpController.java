package net.clazz.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试 http 请求其他的请求方式：post,put(用作更新数据),delete(用作删除数据)
 * @author yorick
 * @date 2018/11/14 下午8:46
 */

@RestController
public class OtherHttpController {

    private Map<String, Object> params = new HashMap<>(5);

    /**
     * 测试 post 请求
     * @param id
     * @param pwd
     * @return
     */
    @PostMapping("/v1/post")
    public Map<String, Object> testPost(Long id, String pwd) {
        params.clear();
        params.put("id", id);
        params.put("pwd", pwd);
        return params;
    }

    /**
     * 测试 put 请求
     * @param id
     * @return
     */
    @PutMapping("/v1/put")
    public Map<String, Object> testPut(Long id, String name) {
        params.clear();
        params.put("id", id);
        params.put("name", name);
        return params;
    }

    /**
     * 测试 delete 请求
     * @param id
     * @return
     */
    @DeleteMapping("/v1/delete")
    public Map<String, Object> testDelete(Long id) {
        params.clear();
        params.put("id", id);
        return params;
    }

}
