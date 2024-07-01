package org.example.activemqspringbootimpl;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @JmsListener(destination = "test-queue")
    public void receive(String message){
        System.out.println("Received message is :- " + message);
    }
}
