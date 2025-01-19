package com.clazzbridge.connection.domain.chatMessage.repository;

import com.clazzbridge.connection.domain.chatMessage.entity.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {
}
