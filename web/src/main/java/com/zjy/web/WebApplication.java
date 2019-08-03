package com.zjy.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication(scanBasePackages = {"com.zjy"})
@MapperScan("com.zjy.daos")
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

    // http://localhost:8080/workOrderBase/test
    // http://localhost:8080/appWorkOrder/test
    // http://localhost:8080/afterSaleWorkOrder/test
}
