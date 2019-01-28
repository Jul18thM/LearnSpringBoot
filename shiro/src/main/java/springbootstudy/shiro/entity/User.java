package springbootstudy.shiro.entity;
/**
 *@author Jul.18th.M
 *@date 2019-01-25 13:20
 *description 用户实体类
 */
public class User {

    /** 自增id */
    private Long id;

    /** 用户名 */
    private String username;

    /** 密码 */
    private String password;

    /** 角色名：shiro支持多个角色，而且接收参数也是 Set<String> 集合，但此处为了简单起见就定义成String类型了 */
    private String roleName;

    /** 是否禁用 */
    private boolean locked;

    /** 构造函数 */
    public User(Long id, String username, String password, String roleName, boolean locked) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roleName = roleName;
        this.locked = locked;
    }

    /** get set 方法 */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
