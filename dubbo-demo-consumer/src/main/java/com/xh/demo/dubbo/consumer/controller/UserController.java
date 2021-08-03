package com.xh.demo.dubbo.consumer.controller;

import com.xh.demo.dubbo.api.dto.User;
import com.xh.demo.dubbo.consumer.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author xiehui1956@gmail.com on 2021/8/3 9:39 上午
 * @version 1.0.0
 */
@RestController
public class UserController {

    @Resource
    private UserClient userClient;

    @GetMapping("/findByUserId")
    public User findByUserId(Long id){
        User userById = userClient.findUserById(id);
        return userById;
    }

}
