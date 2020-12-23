package com.douyu.app.usercom.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.douyu.app.api.service.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liulang
 * @Date: 2020/12/22 17:33
 */
@RestController
public class UserController {

    @Reference
    private IUserService userService;

    @GetMapping("/all")
    public Object userList() throws Exception {
        return userService.findAll();
    }
}
