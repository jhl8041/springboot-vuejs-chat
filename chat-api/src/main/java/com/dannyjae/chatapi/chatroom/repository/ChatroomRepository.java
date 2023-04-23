package com.dannyjae.chatapi.chatroom.repository;

import com.dannyjae.chatapi.chatroom.domain.Chatroom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChatroomRepository extends JpaRepository<Chatroom, Long> {
    List<Chatroom> findAllByDelYnOrderByCreatedAtDesc(String delYn);
}
