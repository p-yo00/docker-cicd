package org.example.deployproject;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageService {

    private final MessageRepository messageRepository;

    public void insertMessage(String message) {
        messageRepository.save(MessageEntity.builder()
            .name("anonymous")
            .message(message)
            .build());
    }

    public List<MessageEntity> getMessage() {
        return messageRepository.findAll();
    }
}
