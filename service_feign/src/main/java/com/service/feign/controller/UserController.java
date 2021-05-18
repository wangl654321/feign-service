package com.service.feign.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者：@author wl
 * 创建时间：2021/5/137:10 下午
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
@RequestMapping("/user")
public class UserController {

    @GetMapping("/getUserList")
    public ModelMap getUserList() {
        ModelMap modelMap = new ModelMap();
        List<String> userList = new ArrayList<>();
        userList.add("用户1");
        userList.add("用户2");
        userList.add("用户3");
        modelMap.put("data", userList);
        return modelMap;
    }
}
