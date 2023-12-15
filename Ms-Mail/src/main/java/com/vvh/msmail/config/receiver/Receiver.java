package com.vvh.msmail.config.receiver;

import com.vvh.msmail.entities.User;
import com.vvh.msmail.service.MailService;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.concurrent.CountDownLatch;

@NoArgsConstructor
public class Receiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

    @Autowired
    private MailService mailService;

    //Main thread is wait util CountDownLatch = 0;
    private final CountDownLatch latch = new CountDownLatch(1);

    @KafkaListener(topics = "${spring.kafka.template.default-topic}")
    public void consumer(User payload){
        LOGGER.info("Receiver payload = '{}'", payload.toString());
        mailService.sendSimpleEmail(payload);
        latch.countDown();
    }
}
