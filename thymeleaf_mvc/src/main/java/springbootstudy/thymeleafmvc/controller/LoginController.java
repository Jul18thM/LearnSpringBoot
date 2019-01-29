package springbootstudy.thymeleafmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

/**
 * @author Jul.18th.M
 * description 登陆控制
 * @date 2019-01-22 23:15
 */

@Controller
public class LoginController {

    /**
     *查出一些数据在页面显示
     *@author Jul.18th.M
     *@param map [键值对]
     *@return 返回success.html页面
     */
    @RequestMapping("/success")
    public String success(Map<String, Object> map){
        map.put("hello", "<h1>你好</h1>");
        map.put("users", Arrays.asList("zhangsan", "lisi", "wangwu"));
        return "success";
    }
}
