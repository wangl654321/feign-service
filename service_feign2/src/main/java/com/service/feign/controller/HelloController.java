package com.service.feign.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者： @author wl
 * 创建时间： 2021/5/12 3:26 下午
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
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("访问来1了......");
        return "hello1";
    }

    @RequestMapping("/hjcs")
    public List<String> laowangs(String ids) {
        List<String> list = new ArrayList<>();
        list.add("laowang1");
        list.add("laowang2");
        list.add("laowang3");
        return list;
    }

    /**
     * 新增的方法
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/hellol", method = RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public User hello(@RequestHeader String name, @RequestHeader Integer age) {
        return new User(name, age);
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String hello(@RequestBody User user) {
        return "Hello " + user.getName() + ", " + user.getAge();
    }

}