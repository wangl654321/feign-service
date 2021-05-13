package com.service.feign.controller;

import com.eureka.service.EurekaClientFeign;
import org.springframework.web.bind.annotation.RestController;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者：@author wl
 * 创建时间：2021/5/138:20 下午
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
@RestController
public class EurekaClientFeignImpl implements EurekaClientFeign {

    @Override
    public String getMessageFromClient(String name) {
        return "Hello===," + name + ", query result,2";
    }
}
