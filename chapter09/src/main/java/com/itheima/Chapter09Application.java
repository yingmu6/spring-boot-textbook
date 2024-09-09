package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling    // 开启基于注解的定时任务支持
@EnableAsync        // 开启基于注解的异步任务支持
@SpringBootApplication
public class Chapter09Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter09Application.class, args);
    }

}
