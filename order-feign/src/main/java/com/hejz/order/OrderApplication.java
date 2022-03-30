package com.hejz.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

//    /**
//     * 调RestTemplate要配置RestTemplate，官方推荐一般使用builder建造方法
//     * @param builder
//     * @return
//     */
//    @Bean
//    @LoadBalanced //@LoadBalanced依赖负载均称衡器
//    public RestTemplate restTemplate(RestTemplateBuilder builder){
//        RestTemplate restTemplate = builder.build();
//        return restTemplate;
//    }

}
