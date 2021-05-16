package com.service.feign.service;

import com.eureka.service.EurekaClientFeign;
import com.eureka.service.TestEurekaFeign;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者：@author wl
 * 创建时间：2021/5/138:04 下午
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
@Service
public class FeignService {

    @Resource
    private EurekaClientFeign eurekaClientFeign;

    @Resource
    private TestEurekaFeign testEurekaFeign;

    public String get(String name) {
        return eurekaClientFeign.getMessageFromClient(name);
    }

    public String testEureka(String name) {
        return testEurekaFeign.testEureka(name);
    }
}