package com.wuyou.sc_student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ScStudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScStudentApplication.class, args);
    }

}
