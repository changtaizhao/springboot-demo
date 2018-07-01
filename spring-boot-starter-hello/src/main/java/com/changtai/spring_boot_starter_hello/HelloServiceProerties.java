package com.changtai.spring_boot_starter_hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Auther: zhaoct
 * @Date: 2018-07-01 21:06
 * @Description:
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProerties {

    private static final String MSG = "world";

    private String msg = MSG;


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
