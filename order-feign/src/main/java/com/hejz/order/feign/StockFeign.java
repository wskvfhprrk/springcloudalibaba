package com.hejz.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "stock-service",configuration = FeignClient.class)
public interface StockFeign {
    @GetMapping("destocking")
    String destocking();
}
