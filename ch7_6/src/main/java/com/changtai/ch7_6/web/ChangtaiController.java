package com.changtai.ch7_6.web;

import com.changtai.ch7_6.domain.ChangtaiMessage;
import com.changtai.ch7_6.domain.ChangtaiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;

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

    @Autowired
    private SimpMessagingTemplate messagingTemplate;//1

    @MessageMapping("/chat")
    public void handleChat(Principal principal, String msg) { //2
        if (principal.getName().equals("test1")) {//3
            messagingTemplate.convertAndSendToUser("test2",
                    "/queue/notifications", principal.getName() + "-send:"
                            + msg);
        } else {
            messagingTemplate.convertAndSendToUser("test1",
                    "/queue/notifications", principal.getName() + "-send:"
                            + msg);
        }
    }

}
