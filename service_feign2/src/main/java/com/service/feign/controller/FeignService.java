package com.service.feign.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者：@author wl
 * 创建时间：2021/5/123:30 下午
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
@FeignClient(value = "feign-consumer")
public interface FeignService {

    /**
     * 服务中方法的映射路径
     *
     * @return
     */
    @RequestMapping("/hello")
    String hello();

    /**
     * @param name
     * @return
     */
    @RequestMapping(value = "/hellol", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    /**
     * @param name
     * @param age
     * @return
     */
    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    /**
     * @param user
     * @return
     */
    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    String hello(@RequestBody User user);
}
