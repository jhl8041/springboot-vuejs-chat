package com.dannyjae.chatapi.chatroom.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class ChatroomCreateRequest {
    private String title;
    private String password;
    private int size;
}
