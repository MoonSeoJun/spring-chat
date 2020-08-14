package com.kjbin0420.springchat.model;

public class Chat {
    private MessageType messageType;
    private String content;
    private String sender;

    public MessageType getMessageType() {
        return messageType;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
