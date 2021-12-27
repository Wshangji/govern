package com.govern.webservie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@MapperScan("com.govern.webservie.mapper")
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class WebServieApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebServieApplication.class, args);
    }

}
