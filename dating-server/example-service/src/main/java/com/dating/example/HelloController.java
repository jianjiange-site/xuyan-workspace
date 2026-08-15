package com.dating.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 示例接口，用于验证服务是否正常启动。
 */
@RestController
public class HelloController {

    /**
     * 返回固定的 hello 字符串。
     *
     * @return hello
     */
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}