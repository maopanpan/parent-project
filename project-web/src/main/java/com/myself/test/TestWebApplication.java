package com.myself.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类名称：TestWebApplication<br>
 * 类描述：<br>
 * 创建时间：2018年08月27日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@SpringBootApplication
@RestController
public class TestWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestWebApplication.class, args);
    }
}
