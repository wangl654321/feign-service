package com.eureka.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者：@author wl
 * 创建时间：2021/5/125:48 下午
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
@FeignClient(
        name = "login-service",
        url = "${eureka.client.serviceUrl.defaultZone}"
)
public interface PlatUserFacade {

    /**
     * 查询
     *
     * @param value
     * @return
     */
    @RequestMapping(value = "facade/plat/userInfo")
    String userInfo(@RequestParam(value = "value") String value);
}
