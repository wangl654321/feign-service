package com.eureka.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者：@author wl
 * 创建时间：2021/5/138:02 下午
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
@FeignClient(value = "eureka-client")
public interface EurekaClientFeign {

    /**
     * 客户端的方法地址
     *
     * @param name
     * @return
     */
    @GetMapping("/query")
    String getMessageFromClient(@RequestParam(value = "name") String name);
}
