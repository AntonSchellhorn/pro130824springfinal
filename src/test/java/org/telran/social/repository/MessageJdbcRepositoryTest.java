package org.telran.social.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.telran.social.emuns.MessageStatus;
import org.telran.social.model.Message;
import org.telran.social.model.NetworkUser;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

class MessageJdbcRepositoryTest {

    @Autowired
    private MessageRepository messageRepository;

    @Test
    void testGetByUserId() {
        List<Message> messages = messageRepository.getAllByUserId(1l);
    }

    @Test
    void testGetById() {
        Message byId = messageRepository.getById(1l);
    }

    @Test
    void testCreate() {
        List<Message> messagesBefore = messageRepository.getAllByUserId(1l);
        Message message = new Message(null, "test last", 1l, 2l, MessageStatus.SENT);
//        Long lastMessageId = messagesBefore.get(messagesBefore.size() - 1).getId();

        Long createdMessageId = messageRepository.create(message).getId();
        List<Message> messagesAfter = messageRepository.getAllByUserId(1l);

        assertEquals(messagesBefore.size() + 1, messagesAfter.size());
//        assertEquals(lastMessageId + 1, createdMessageId);
    }

    @Test
    void testDelete() {
        List<Message> messagesBefore = messageRepository.getAllByUserId(1l);

        messageRepository.deleteById(1l);
        List<Message> messagesAfter = messageRepository.getAllByUserId(1l);

        assertEquals(messagesBefore.size() - 1, messagesAfter.size());
    }
}