package com.douyu.app.usercom.controller;

import com.douyu.app.api.service.IUserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liulang
 * @Date: 2020/12/22 17:33
 */
@RestController
public class UserController {

    @DubboReference
    private IUserService userService;

    @GetMapping("/all")
    public Object userList() throws Exception {
        return userService.findAll();
    }
}
