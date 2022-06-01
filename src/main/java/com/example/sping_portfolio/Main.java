package com.example.sping_portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@SpringBootApplication(scanBasePackages = {"test"} , exclude = JpaRepositoriesAutoConfiguration.class)
@SpringBootApplication
public class Main  {


    public static void main(String[] args) {
        
        SpringApplication.run(Main.class, args);
    }

    // 

}
