package com.vvh.msuser.service;

import com.vvh.msuser.config.kafka.Sender;
import com.vvh.msuser.dtos.UserDTO;
import com.vvh.msuser.request.UserRegisterRequest;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    @Value("${spring.kafka.template.default-topic}")
    private String USER_DEFAULT_TOPIC;

    private final Sender sender;

    @Override
    public UserDTO registerUser(UserRegisterRequest request) {
        ModelMapper modelMapper = new ModelMapper();
        UserDTO userDTO = modelMapper.map(request, UserDTO.class);
        sender.send(USER_DEFAULT_TOPIC, userDTO);
        return userDTO;
    }
}
