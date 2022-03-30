package com.hejz.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Order {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("createOrder")
    public String createOrder(){
        System.out.println("生成订单，并去减库存");
        String msg = restTemplate.getForObject("http://stock-service/destocking", String.class) ;
        return "hello world"+msg;
    }
}
