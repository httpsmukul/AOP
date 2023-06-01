package com.example.AOP;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.AOP")
public class AppConfig {

//    @Bean
//    public void create(){
//        System.out.println("new bean");
//    }
}
