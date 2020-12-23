package com.douyu.app.userpro.service.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import com.douyu.app.api.pojo.po.User;
import com.douyu.app.api.service.IUserService;

import java.util.List;

/**
 * @Author: liulang
 * @Date: 2020/12/22 17:02
 */
@Service(retries = 2,timeout = 1000,cluster = "")
public class UserSeviceImpl implements IUserService {

    @Override
    public List<User> findAll() throws Exception {
        System.err.println("222222222222");
        Thread.sleep(2000);
        throw new Exception("error");
    }
}
