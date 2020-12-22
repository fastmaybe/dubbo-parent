package com.douyu.app.userpro.service.dubbo;

import com.douyu.app.api.pojo.po.User;
import com.douyu.app.api.service.IUserService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: liulang
 * @Date: 2020/12/22 17:02
 */
@DubboService(version = "1.0.0")
public class UserSeviceImpl implements IUserService {

    @Override
    public List<User> findAll() throws Exception {
        User user = new User();
        user.setAge(21);
        user.setId(2);
        user.setName("provider1");
        return Arrays.asList(user);
    }
}
