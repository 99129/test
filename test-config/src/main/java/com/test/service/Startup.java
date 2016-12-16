package com.test.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by admin on 2016/12/15.
 */
@SpringBootApplication
@EnableConfigServer
public class Startup {
    public static void main(String[] args) {
        SpringApplication.run(Startup.class,args);
    }


//    @Value("${spring.cloud.service.server.git.uri}")
//    public String sss;
//
//    @Bean
//    public String sssss(){
//        System.out.println(sss);
//        return sss;
//    }
}
