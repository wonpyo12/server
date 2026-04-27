package com.jojoldu.book.springboot.web.dto;
import lombok.Getter;

import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
@Getter
@RequiredArgsConstructor
public class HealthResponseto {
    private final String status;
    private final LocalDateTime timestamp;
}
