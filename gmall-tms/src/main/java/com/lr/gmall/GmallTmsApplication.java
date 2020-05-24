package com.lr.gmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lr.gmall.config.dao")
public class GmallTmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallTmsApplication.class, args);
    }

}
