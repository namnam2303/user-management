package com.supportportal.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.Multipart;
import javax.mail.internet.MimeMessage;

@Service
public class EmailService {
    @Value("${spring.mail.username}")
    private String fromEmail;

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendMail(Multipart file, String to, String subject, String body) {
        try {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();

            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, file != null);

            mimeMessageHelper.setFrom(fromEmail);
            mimeMessageHelper.setTo(to);
            //mimeMessageHelper.setCc(cc);
            mimeMessageHelper.setSubject(subject);
            mimeMessageHelper.setText(body);

//            for (int i = 0; i < file.length; i++) {
//                mimeMessageHelper.addAttachment(
//                        file[i].getOriginalFilename(),
//                        new ByteArrayResource(file[i].getBytes()));
//            }

            javaMailSender.send(mimeMessage);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
