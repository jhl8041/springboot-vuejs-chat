package com.dannyjae.chatapi.chatroom.controller;

import com.dannyjae.chatapi.chatroom.domain.Chatroom;
import com.dannyjae.chatapi.chatroom.dto.ChatroomCreateRequest;
import com.dannyjae.chatapi.chatroom.dto.ChatroomDto;
import com.dannyjae.chatapi.chatroom.service.ChatroomService;
import com.dannyjae.chatapi.common.domain.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
public class ChatroomController {

    private final ChatroomService chatroomService;

    @PostMapping("/api/chatroom")
    public ApiResponse<?> createChatroom(@RequestBody ChatroomCreateRequest request){
        log.info("chatroom request: {}", request);
        chatroomService.createChatroom(request);
        return ApiResponse.succeed();
    }

    @GetMapping("/api/chatroom/list")
    public ApiResponse<List<ChatroomDto>> getChatroomList(){
        return ApiResponse.succeed(chatroomService.getChatroomList());
    }
}
