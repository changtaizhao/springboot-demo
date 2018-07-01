package com.changtai.spring_boot_starter_hello;

/**
 * @Auther: zhaoct
 * @Date: 2018-07-01 21:09
 * @Description:
 */
public class HelloService {

    private String msg;

    public String sayHello(){
        return "Hello" + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
