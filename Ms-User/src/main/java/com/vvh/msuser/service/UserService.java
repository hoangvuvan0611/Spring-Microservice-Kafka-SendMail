package com.vvh.msuser.service;

import com.vvh.msuser.dtos.UserDTO;
import com.vvh.msuser.request.UserRegisterRequest;

public interface UserService {
    UserDTO registerUser(UserRegisterRequest request);
}
