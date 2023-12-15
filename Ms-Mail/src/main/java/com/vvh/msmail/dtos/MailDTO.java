package com.vvh.msmail.dtos;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MailDTO {
    private String sendTo;
    private String subject;
    private String text;
}
