package com.xh.demo.dubbo.api.dto;

import java.io.Serializable;

/**
 * TODO
 *
 * @author xiehui1956@gmail.com on 2021/8/3 9:28 上午
 * @version 1.0.0
 */
public class User implements Serializable {

    private static final long serialVersionUID = 2270620375450777023L;

    private Long id;

    private String username;

    private String failMes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFailMes() {
        return failMes;
    }

    public void setFailMes(String failMes) {
        this.failMes = failMes;
    }
}
