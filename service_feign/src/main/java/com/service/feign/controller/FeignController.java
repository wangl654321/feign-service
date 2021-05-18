package com.service.feign.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.service.feign.service.FeignService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者：@author wl
 * 创建时间：2021/5/138:05 下午
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
@Api(tags = "Feign测试管理", value = "Feign测试管理")
public class FeignController {

    @Resource
    private FeignService feignService;


    @GetMapping("/list")
    @ApiOperationSupport(order = 1)
    @ApiOperation(value = "list测试")
    public String get(@RequestParam(defaultValue = "sjj", required = false) String name) {
        return feignService.get(name);
    }

    @GetMapping("/testEureka")
    @ApiOperationSupport(order = 2)
    @ApiOperation(value = "testEureka测试")
    public String testEureka(@RequestParam(defaultValue = "testEureka", required = false) String name) {
        return feignService.testEureka(name);
    }
}