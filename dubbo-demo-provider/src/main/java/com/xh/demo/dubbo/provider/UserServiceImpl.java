package com.xh.demo.dubbo.provider;

import com.xh.demo.dubbo.api.UserService;
import com.xh.demo.dubbo.dto.User;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * TODO
 *
 * @author xiehui1956@gmail.com on 2021/8/3 9:36 上午
 * @version 1.0.0
 */
@DubboService(loadbalance = "random", cluster = "failsafe")
public class UserServiceImpl implements UserService {

    public User findUserById(Long userId) {
        User user = new User();
        user.setId(userId);
        user.setUsername("宋茜");
        return user;
    }

    public User findUserByName(String username) {
        User user = new User();
        user.setId(666L);
        user.setUsername(username);
        return user;
    }
}
