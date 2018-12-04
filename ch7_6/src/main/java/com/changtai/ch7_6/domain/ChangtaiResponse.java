package com.changtai.ch7_6.domain;

/**
 * @Auther: zhaoct
 * @Date: 2018-07-23 20:40
 * @Description: 服务器向浏览器发送消息
 */
public class ChangtaiResponse {

    private String responseMessage;

    public ChangtaiResponse(String responseMessage){
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
