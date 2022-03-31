package com.hejz.order.config;

import feign.Logger;
import feign.Request;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * feign配置
 * 全局配置加@Configuration
 * 局部配置不加@Configuration
 */
@Configuration
public class FeignConfig {
    //全局超时时间配置
    @Bean
    public Request.Options options(){
        return new Request.Options(5000,10000);
    }
    //全局日志配置
    @Bean
    public Logger.Level feignLevelConfig(){
        //所有日志
        return Logger.Level.FULL;
    }
    //自定义拦截器
    @Bean
    public RequestInterceptor requestInterceptor(){
        return new FeignAuthRequestInterceptor();
    }
}
