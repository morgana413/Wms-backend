package com.example.warehousedemo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.warehousedemo1.mapper")

public class Warehousedemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Warehousedemo1Application.class, args);
    }

}
