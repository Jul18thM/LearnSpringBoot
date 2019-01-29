package springbootstudy.thymeleafmvc.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Jul.18th.M
 * @date 2019-01-28 22:18
 * description 自定义的springmvc配置类，为了拓展springmvc配置，注解使用@Configuration而不使用@EnableWebMvc
 */

// 使用WebMvcConfigurationSupport可以拓展SpringMVC的功能;WebMvcConfigurationSupport是SpringBoot2.0版本后代替WebMvcConfigurationAdapter的
// 但是使用WebMvcConfigurationSupport会造成无法访问静态资源，而WebMvcConfigurationSupport与WebMvcConfigurationAdapter是实现了WebMvcConfigurer方法，所以实现WebMvcConfigurer接口就可以了

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    /**
     *对addViewControllers的重写实现页面的跳转
     *@author Jul.18th.M
     *@param  registry [注册需要跳转的页面]
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        // 浏览器发送/springbootstudy请求来到success页面
        registry.addViewController("/springbootstudy").setViewName("success");
    }
}
