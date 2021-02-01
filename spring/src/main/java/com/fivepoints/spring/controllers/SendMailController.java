package com.fivepoints.spring.controllers;

import com.fivepoints.spring.services.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("mails")
public class SendMailController {

    @Autowired
    SendMailService sendMailService;

    @PostMapping("simple")
    public String sendEmail(){
        sendMailService.sendEmail();
        return "its okay";
    }
}
