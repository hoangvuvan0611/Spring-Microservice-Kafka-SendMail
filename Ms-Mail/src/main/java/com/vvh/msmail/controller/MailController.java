package com.vvh.msmail.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ms-mail")
public class MailController {
    @GetMapping()
    public ResponseEntity<String> getMail(){
        return new ResponseEntity<>("Called Microservice-Mail! Vu Van Hoang", HttpStatus.OK);
    }
}
