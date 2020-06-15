package com.ho.practice.websocket;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.ho.practice.websocket.handler.SocketTextHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

@Component
public class WebsocketSender implements ApplicationRunner {

    @Autowired
    SocketTextHandler socketTextHandler;
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Set<Entry<String, WebSocketSession>> entrySet = socketTextHandler.getSessions().entrySet();
        while (true) {
            if (entrySet.size() > 0) {
                Iterator<Entry<String, WebSocketSession>> iterator = entrySet.iterator();
                while (iterator.hasNext()) {
                    Entry<String, WebSocketSession> entry = iterator.next();
                    WebSocketSession session = entry.getValue();
                    session.sendMessage(new TextMessage("123"));
                }
                System.out.println("Send Message");
            } else {
                System.out.println("No Client");
            }
            Thread.sleep(1000);
        }
    }

}