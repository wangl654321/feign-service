package com.service.feign.controller;


import org.springframework.stereotype.Component;

/***
 *
 *
 * 描    述：实现的方法是服务调用的降级方法
 *
 * 创 建 者： @author wl
 * 创建时间： 2021/5/12 5:42 下午
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
@Component
public class FeignFallBack implements FeignService {

    @Override
    public String hello() {
        return "implements-hello1";
    }

    @Override
    public String hello(String name) {
        return "error";
    }

    @Override
    public User hello(String name, Integer age) {
        return new User();
    }

    @Override
    public String hello(User user) {
        return "error";
    }
}