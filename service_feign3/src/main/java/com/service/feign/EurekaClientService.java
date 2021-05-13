package com.service.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/***
 *
 *
 * 描    述：eureka客户端（生产者服务）
 *
 * 创 建 者： @author wl
 * 创建时间： 2021/5/12 3:15 下午
 * 创建描述：
 *
 * 修 改 者：  
 * 修改时间： 
 * 修改描述： 
 *
 * 审 核 者：
 * 审核时间：
 * 审核描述：
 *
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientService {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientService.class, args);
    }

}
