package com.vvh.msuser.config.kafka;

import com.vvh.msuser.dtos.UserDTO;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

@NoArgsConstructor
public class Sender {
    private static final Logger LOGGER = LoggerFactory.getLogger(Sender.class);

    @Autowired
    private KafkaTemplate<String, UserDTO> kafkaTemplate;

    public void send(String topic, UserDTO payload){
        LOGGER.info("Sending payload = '{}' to topic = '{}'", payload, topic);
        kafkaTemplate.send(topic, payload);
    }
}
