package com.vvh.msuser.request;

import lombok.Getter;

@Getter
public class UserRegisterRequest {
    private String userName;
    private String password;
    private String email;
}
