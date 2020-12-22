package com.douyu.app.userpro.service.dubbo;

import com.douyu.app.api.pojo.po.User;
import com.douyu.app.api.service.IUserService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @Author: liulang
 * @Date: 2020/12/22 14:52
 */

@DubboService(validation = "1.0.0")
public class UserSeviceImpl implements IUserService {
    @Override
    public List<User> findAll() throws Exception {

        Random random = new Random();

        if (random.nextInt(5) == 3){
            throw new Exception("error");
        }
        User user = new User();
        user.setAge(10);
        user.setId(1);
        user.setName("provider2");
        return Arrays.asList(user);
    }

}
