package springbootstudy.shiro.controller;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jul.18th.M
 * @date 2019-01-25 14:19
 * description User控制层
 */
@RestController
@RequestMapping("/users")
public class UserController {

    /**
     *get
     *@author Jul.18th.M
     *@return java.lang.String
     */
    @GetMapping
    public String get() {
        return "get.....";
    }

    /**
     * RequiresRoles 是所需角色 包含 AND 和 OR 两种
     * RequiresPermissions 是所需权限 包含 AND 和 OR 两种
     * //@RequiresPermissions(value = {"user:list", "user:query"}, logical = Logical.OR)
     * @return msg
     */
    @RequiresRoles(value = {"admin", "test"}, logical = Logical.OR)
    @GetMapping("/query")
    public String query() {
        return "query.....";
    }

    /**
     *find
     *@author Jul.18th.M
     *@return java.lang.String
     */
    @GetMapping("/find")
    public String find() {
        return "find.....";
    }
}
