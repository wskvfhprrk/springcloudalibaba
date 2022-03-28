package com.hejz.stock;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Stock {
    @GetMapping("destocking")
    public String destocking(){
        System.out.println("扣减库存成功!");
        return "扣减库存成功";
    }
}
