package com.leventenyiro.javaspring.email;

public interface EmailSender {
    void send(String to, String email);
}
