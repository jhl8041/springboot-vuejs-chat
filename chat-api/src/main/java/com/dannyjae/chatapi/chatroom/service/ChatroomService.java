package com.dannyjae.chatapi.chatroom.service;

import com.dannyjae.chatapi.chatroom.domain.Chatroom;
import com.dannyjae.chatapi.chatroom.dto.ChatroomCreateRequest;
import com.dannyjae.chatapi.chatroom.dto.ChatroomDto;
import com.dannyjae.chatapi.chatroom.repository.ChatroomRepository;
import com.dannyjae.chatapi.common.util.ObjectMapperUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ChatroomService {

    private final ChatroomRepository chatroomRepository;

    public void createChatroom(ChatroomCreateRequest request) {
        chatroomRepository.save(Chatroom.builder()
                        .title(request.getTitle())
                        .password(request.getPassword())
                        .size(request.getSize())
                        .build());
    }

    public List<ChatroomDto> getChatroomList() {
        List<Chatroom> chatroomList = chatroomRepository.findAllByDelYnOrderByCreatedAtDesc("N");
        return ObjectMapperUtil.mapAll(chatroomList, ChatroomDto.class);
    }
}
