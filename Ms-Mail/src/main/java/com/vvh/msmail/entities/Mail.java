package com.vvh.msmail.entities;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Mail {
    private Long id;
    private String sendTo;
    private String subject;
    private String text;
}
