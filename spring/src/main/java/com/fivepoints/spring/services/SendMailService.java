package com.fivepoints.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendMailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail(){
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo("dagboujhatem2017@gmail.com", "dagboujhatem@gmail.com", "hatem.dagbouj@fivepoints.fr");
        mail.setSubject("Testing from Spring Boot");
        mail.setText("Hello World \n Spring Boot Email");
        // Send mail with javaMailSender
        javaMailSender.send(mail);
    }
}
