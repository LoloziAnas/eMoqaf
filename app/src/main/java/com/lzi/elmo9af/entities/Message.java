package com.lzi.elmo9af.entities;

public class Message {

    private Integer message_id;
    private User sender;
    private User reciever;
    private String content;
    private String time;

    public Message(){}
    public Message(Integer message_id, User sender, User reciever, String content,String time) {
        this.message_id = message_id;
        this.sender = sender;
        this.reciever = reciever;
        this.content = content;
        this.time = time;
    }

    public Integer getMessage_id() {
        return message_id;
    }

    public void setMessage_id(Integer message_id) {
        this.message_id = message_id;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReciever() {
        return reciever;
    }

    public void setReciever(User reciever) {
        this.reciever = reciever;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
