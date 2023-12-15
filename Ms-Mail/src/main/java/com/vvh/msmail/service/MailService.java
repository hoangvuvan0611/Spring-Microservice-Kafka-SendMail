package com.vvh.msmail.service;

import com.vvh.msmail.entities.User;

public interface MailService {
    void sendSimpleEmail(User user);
}
