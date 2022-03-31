package com.hejz.order.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * feign日志配置
 * 全局配置加@Configuration
 * 局部配置不加@Configuration
 */
//@Configuration
public class FeignConfig {
    @Bean
    public Logger.Level feignLevelConfig(){
        //所有日志
        return Logger.Level.FULL;
    }
}
