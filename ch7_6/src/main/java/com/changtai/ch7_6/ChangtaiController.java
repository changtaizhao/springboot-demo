package com.changtai.ch7_6;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @Auther: zhaoct
 * @Date: 2018-07-23 20:42
 * @Description:
 */
@Controller
public class ChangtaiController {

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public ChangtaiResponse say(ChangtaiMessage message) throws Exception{
        Thread.sleep(3000);
        return new ChangtaiResponse("Welcome, " + message.getName() + "!");
    }

}
