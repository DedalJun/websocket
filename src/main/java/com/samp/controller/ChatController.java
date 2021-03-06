package com.samp.controller;

import com.samp.domain.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("message")
    @SendTo("/chat/messages")
    public Message getMessages(Message message) {
        System.out.println(message);
        return message;
    }
}
