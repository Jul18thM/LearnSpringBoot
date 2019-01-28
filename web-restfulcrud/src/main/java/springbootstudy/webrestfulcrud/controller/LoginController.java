package springbootstudy.webrestfulcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Jul.18th.M
 * description 登陆控制
 * @date 2019-01-22 23:15
 */

@Controller
public class LoginController {

    /**
     *登陆
     *@author Jul.18th.M
     *@param  str [字符串]
     *@return java.lang.String
     */
    @RequestMapping("/success")
    public String login(String str){
        return "success";
    }
}
