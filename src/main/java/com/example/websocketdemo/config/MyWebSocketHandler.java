package com.example.websocketdemo.config;

import org.springframework.web.socket.*;
import org.springframework.web.socket.handler.TextWebSocketHandler;
import java.util.*;

public class MyWebSocketHandler extends TextWebSocketHandler {

    private final Set<WebSocketSession> sessions = new HashSet<>();

    @Override
    public void afterConnectionEstablished(WebSocketSession session) {
        sessions.add(session);
        System.out.println("Client connecté : " + session.getId());
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        System.out.println("Message reçu du client: " + message.getPayload());

        // Diffusion du message à tous les clients connectés
        for (WebSocketSession s : sessions) {
            s.sendMessage(new TextMessage("Serveur a reçu : " + message.getPayload()));
        }
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) {
        sessions.remove(session);
        System.out.println("Client déconnecté : " + session.getId());
    }
}
