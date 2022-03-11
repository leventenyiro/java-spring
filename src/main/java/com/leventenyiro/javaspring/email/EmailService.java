package com.leventenyiro.javaspring.email;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;

@Service
public class EmailService implements EmailSender {

    private final JavaMailSender mailSender;
    
    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }
    
    @Override
    public void send(String to, String email) {
        // TODO Auto-generated method stub
        
    }
}
