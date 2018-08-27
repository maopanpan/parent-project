package com.myself.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类名称：TestApplication<br>
 * 类描述：<br>
 * 创建时间：2018年08月27日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@SpringBootApplication
@RestController
@Slf4j
public class TestApplication {

    @GetMapping(value = "/sayHello")
    public String sayHello() {
        CoreHandler coreHandler = new CoreHandler("Hello world!");
        LOGGER.info(coreHandler.getContent());
        return coreHandler.getContent();
    }

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
