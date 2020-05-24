package com.lr.gmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.lr.gmall.config.dao")
@EnableTransactionManagement
public class GmallTmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallTmsApplication.class, args);
    }

}
