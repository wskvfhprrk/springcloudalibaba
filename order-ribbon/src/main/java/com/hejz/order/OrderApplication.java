package com.hejz.order;

import com.hejz.config.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//启动类配置ribbon轮询策略
//@RibbonClients(value = {@RibbonClient(name = "stock-service",configuration = RibbonConfig.class)})
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

    /**
     * 调RestTemplate要配置RestTemplate，官方推荐一般使用builder建造方法
     * @param builder
     * @return
     */
    @Bean
    @LoadBalanced //@LoadBalanced依赖负载均称衡器
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        RestTemplate restTemplate = builder.build();
        return restTemplate;
    }

}
