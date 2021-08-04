package com.xh.demo.dubbo.consumer.client;

import com.xh.demo.dubbo.api.UserService;
import com.xh.demo.dubbo.dto.User;

/**
 * TODO
 *
 * @author xiehui1956@gmail.com on 2021/8/3 9:41 上午
 * @version 1.0.0
 */
public class UserClientMock implements UserService {

    @Override
    public User findUserById(Long userId) {
        User user = new User();
        user.setFailMes("触发熔断!");
        return user;
    }

    @Override
    public User findUserByName(String username) {
        User user = new User();
        user.setFailMes("触发熔断!");
        return user;
    }
}
