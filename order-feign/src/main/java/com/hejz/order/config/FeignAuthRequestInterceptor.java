package com.hejz.order.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;

import java.util.UUID;

public class FeignAuthRequestInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate requestTemplate) {
        //业务逻辑
        String token = UUID.randomUUID().toString();
        requestTemplate.header("Authorization",token);
    }
}
