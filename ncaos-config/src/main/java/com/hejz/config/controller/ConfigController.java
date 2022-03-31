package com.hejz.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope  //如果需要感知配置文件变需要加注解——这个与spring cloud config一样
public class ConfigController {

    @Value("${user.name}")
    private String username;

    @GetMapping("getUsername")
    public String getUsername(){
        return username;
    }
}