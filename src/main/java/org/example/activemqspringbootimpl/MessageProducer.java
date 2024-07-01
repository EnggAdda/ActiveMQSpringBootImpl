package org.example.activemqspringbootimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageProducer {

    @Autowired
    private JmsTemplate jmsTemplate;

    @GetMapping("/send")
    public String sendMessage(@RequestParam String message) {
        jmsTemplate.convertAndSend("test-queue", message);
        return "Message is being sent";
    }
}
