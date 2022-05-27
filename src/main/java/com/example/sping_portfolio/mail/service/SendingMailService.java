package com.example.sping_portfolio.mail.service;

public interface SendingMailService {
    boolean sendMail(String subject, String body);
}