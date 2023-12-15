package com.vvh.msuser.controller;

import com.vvh.msuser.dtos.UserDTO;
import com.vvh.msuser.request.UserRegisterRequest;
import com.vvh.msuser.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ms-user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping()
    public ResponseEntity<String> getUser(){
        return new ResponseEntity<>("Called Microservice-User! Vu Van Hoang", HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<UserDTO> registerUser(@RequestBody UserRegisterRequest request){
        return new ResponseEntity<>(userService.registerUser(request), HttpStatus.CREATED);
    }
}
