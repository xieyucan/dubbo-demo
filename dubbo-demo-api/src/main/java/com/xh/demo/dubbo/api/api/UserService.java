package com.xh.demo.dubbo.api.api;

import com.xh.demo.dubbo.api.dto.User;

/**
 * TODO
 *
 * @author xiehui1956@gmail.com on 2021/8/3 9:27 上午
 * @version 1.0.0
 */
public interface UserService {

    User findUserById(Long userId);
}
