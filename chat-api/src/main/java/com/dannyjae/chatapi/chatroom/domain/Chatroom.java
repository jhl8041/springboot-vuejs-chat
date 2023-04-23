package com.dannyjae.chatapi.chatroom.domain;

import com.dannyjae.chatapi.common.domain.AuditEntity;
import com.dannyjae.chatapi.common.util.PasswordUtil;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Chatroom extends AuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roomId;
    private String title;
    private String password;
    private int size;
    private String delYn = "N";

    @Builder
    public Chatroom(String title, String password, int size) {
        this.title = title;
        this.roomId = getRoomId();
        this.password = PasswordUtil.encode(password);
        this.size = size;
    }

    public void delete(){
        this.delYn = "Y";
    }

    private String getRoomId() {
        return UUID.randomUUID().toString().replace("-","");
    }
}
