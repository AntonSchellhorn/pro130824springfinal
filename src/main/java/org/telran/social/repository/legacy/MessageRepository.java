package org.telran.social.repository.legacy;

import org.telran.social.entity.Message;

import java.util.List;

public interface MessageRepository {

    List<Message> getAllByUserId(Long userId);

    Message getById(Long messageId);

    Message create(Message message);

    void deleteById(Long id);
}
