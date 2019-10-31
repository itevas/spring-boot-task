package com.lelek.springBoot.model;

import com.lelek.springBoot.dto.MessageDto;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Objects;

@Slf4j
@Getter
@Setter
@Component
public class MySimpleMailMessage extends SimpleMailMessage {

    private boolean sent = false;
    private long id = 0;

}