package net.clazz.controller;

import net.clazz.entity.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yorick
 * @date 2018/11/13 下午9:18
 */

@RestController
public class HttpGetController {

    private Map<String, Object> params = new HashMap<>(10);

    /**
     * 测试 restful 协议
     * @param userId
     * @return
     */
    @RequestMapping(path="/{user_id}", method = RequestMethod.GET)
    public Map<String, Object> testRequestMapping(@PathVariable("user_id") Long userId) {
        params.clear();
        params.put("user_id", userId);
        return params;
    }

    /**
     * 测试 RequestMapping 多个参数
     * @param depId
     * @param userId
     * @return
     */
    @RequestMapping(path="/{dep_id}/{user_id}", method={RequestMethod.GET, RequestMethod.POST})
    public Map<String, Object> testRequestMapping(@PathVariable("dep_id") Long depId,
                                                  @PathVariable("user_id") Long userId) {
        params.clear();
        params.put("dep_id", depId);
        params.put("user_id", userId);
        return params;
    }

    /**
     * 测试 GetMapping
     * @param userId
     * @return
     */
    @GetMapping(path = "/v1/{user_id}")
    public Map<String, Object> testGetMapping(@PathVariable("user_id") Long userId) {
        params.clear();
        params.put("user_id", userId);
        return params;
    }

    /**
     * 测试 RequestParam 默认值
     * @param from
     * @param to
     * @return
     */
    @GetMapping(path = "/v2/page_user")
    public Map<String, Object> testRequestParam(@RequestParam(defaultValue="0", name="pageIndex") int from, int to) {
        params.clear();
        params.put("from", from);
        params.put("to", to);
        return params;
    }

    /**
     * 测试：@RequestMapping + @RequestBody 注入实体类
     *      注意：    1.http 请求头需设置为：application/json
     *
     * @param user
     * @return
     */
    @GetMapping(path = "/v2/add_user")
    public Map<String, Object> testResponseBody(@RequestBody User user) {
        params.clear();
        params.put("user", user);
        return params;
    }

    /**
     * 测试 RequestHeader
     * @param accessToken
     * @param name
     * @return
     */
    @GetMapping("/v1/test_header")
    public Map<String, Object> testRequestHeader(@RequestHeader("access_token") String accessToken, String name) {
        params.clear();
        params.put("access_token", accessToken);
        params.put("name", name);
        return params;
    }

    /**
     * 测试 HttpServletRequest
     * @param request
     * @return
     */
    @GetMapping(path="/v2/test")
    public Map<String, Object> testHttpServletRequest(HttpServletRequest request) {
        params.clear();
        String userId = request.getParameter("user_id");
        params.put("user_id", userId);
        return params;
    }

}
