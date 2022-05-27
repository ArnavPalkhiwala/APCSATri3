package com.example.sping_portfolio.mail.service;

//import com.hellokoding.form.model.MailProperties;
import com.example.sping_portfolio.mail.model.MailProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class SESService implements SendingMailService {
    private final MailProperties mailProperties;

    @Autowired
    SESService(MailProperties mailProperties){
        this.mailProperties = mailProperties;
    }

    public boolean sendMail(String subject, String body) {
        try {
            Properties props = System.getProperties();
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(props);

            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress("no-reply@gmail.com", "no-reply"));
            //System.out.println("From: " + mailProperties.getFrom());
            msg.setRecipient(Message.RecipientType.TO, new InternetAddress("codingkids20@gmail.com"));
            msg.setSubject(subject);
            msg.setContent(body, "text/html");

            Transport transport = session.getTransport();
            transport.connect("smtp.gmail.com", "codingkids20@gmail.com", "Coding123!");
            transport.sendMessage(msg, msg.getAllRecipients());
            return true;
        } catch (Exception ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, ex.getMessage(), ex);
            System.out.println("AN EXCEPTION OCCURED");
        }

        return false;
    }
}
