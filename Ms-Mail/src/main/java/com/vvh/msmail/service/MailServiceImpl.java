package com.vvh.msmail.service;

import com.vvh.msmail.entities.Mail;
import com.vvh.msmail.entities.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MailServiceImpl implements MailService{

    @Value("${spring.mail.username}")
    private String sendFrom;

    private final JavaMailSender mailSender;

    @Override
    public void sendSimpleEmail(User user) {
        try{
            Mail mail = Mail.builder()
                    .id(1L)
                    .sendTo(user.getEmail())
                    .subject("Notification")
                    .text("Hello " + user.getUserName())
                    .build();

            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(sendFrom);
            message.setTo(mail.getSendTo());
            message.setSubject(mail.getSubject());
            message.setText(mail.getText());

            mailSender.send(message);
        }catch (MailException mailException){
            mailException.printStackTrace();
        }
    }
}
