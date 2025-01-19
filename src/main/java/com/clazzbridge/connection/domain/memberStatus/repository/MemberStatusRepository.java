package com.clazzbridge.connection.domain.memberStatus.repository;

import com.clazzbridge.connection.domain.chatMessage.entity.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberStatusRepository extends JpaRepository<ChatMessage, Long> {
}
