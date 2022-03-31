package com.hejz.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class ConfigApplication {
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext context = SpringApplication.run(ConfigApplication.class, args);
        while (true) {
            TimeUnit.SECONDS.sleep(1);
            String username = context.getEnvironment().getProperty("user.name");
            String age = context.getEnvironment().getProperty("user.age");
            System.out.println("name:" + username + ";age:" + age);
        }
    }
}
