package org.example.deployproject;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
@RequiredArgsConstructor
public class MessageRestController {

    private final MessageService messageService;

    @PostMapping
    public ResponseEntity<String> insertMessage(@RequestBody String message) {
        messageService.insertMessage(message);

        return ResponseEntity.ok("success");
    }

    @GetMapping
    public ResponseEntity<List<MessageEntity>> getMessage() {
        return ResponseEntity.ok(messageService.getMessage());
    }
}
