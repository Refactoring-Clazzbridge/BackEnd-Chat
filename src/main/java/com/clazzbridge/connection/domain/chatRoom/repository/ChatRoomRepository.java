package com.clazzbridge.connection.domain.chatRoom.repository;

import com.clazzbridge.connection.domain.chatMessage.entity.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRoomRepository extends JpaRepository<ChatMessage, Long> {
}
