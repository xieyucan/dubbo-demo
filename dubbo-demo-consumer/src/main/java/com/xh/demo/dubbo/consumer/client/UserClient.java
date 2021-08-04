package com.xh.demo.dubbo.consumer.client;

import com.xh.demo.dubbo.api.UserService;
import com.xh.demo.dubbo.dto.User;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author xiehui1956@gmail.com on 2021/8/3 9:40 上午
 * @version 1.0.0
 */
@Service
public class UserClient {

    @Reference(loadbalance = "roundrobin", cluster = "failfast", check = false, mock = "com.xh.demo.dubbo.consumer.client.UserClientMock")
    private UserService userService;

    public User findUserById(Long userId) {
        return userService.findUserById(userId);
    }
}
