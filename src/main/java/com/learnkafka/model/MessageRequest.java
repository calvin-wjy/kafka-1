package com.learnkafka.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageRequest{
    public String message;

    public MessageRequest(@JsonProperty("message") String message) {
        this.message = message;
    }
}