package com.dating.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 示例服务启动入口。
 */
@SpringBootApplication
public class ExampleApplication {
    /**
     * 启动示例服务。
     *
     * @param args JVM 启动参数，可为空
     */
    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }
}
