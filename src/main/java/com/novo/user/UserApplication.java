package com.novo.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: JUN
 * @Date: 2019/8/3 22:32
 */
@SpringBootApplication
@RestController
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
    @Value("${spring.datasource.url}")
    private String value;

    @RequestMapping(value = "url")
    public String getUrl(){
        return value;
    }
}
