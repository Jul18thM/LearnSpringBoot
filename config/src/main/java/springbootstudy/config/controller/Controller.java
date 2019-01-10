package springbootstudy.config.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Controller
 * @Description TODO
 * @Author Jul.18th.M
 * @Date 2019/1/10 23:24
 * @Version 1.0
 **/

@RestController
public class Controller {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
