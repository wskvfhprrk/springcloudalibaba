package com.hejz.order.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * feign日志配置
 */
@Configuration
public class FeignConfig {
    @Bean
    public Logger.Level feignLevelConfig(){
        //所有日志
        return Logger.Level.FULL;
    }
}
