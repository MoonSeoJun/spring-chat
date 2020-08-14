package com.kjbin0420.springchat.controller;

import com.kjbin0420.springchat.model.Chat;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {
    @MessageMapping("/sendMessage")
    public Chat sendMessage(@Payload Chat chat) {

    }
}
