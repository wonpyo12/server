package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.web.dto.HealthResponseto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HealthController {
@GetMapping("/health")
public HealthResponseto health(){
    return new HealthResponseto("OK", LocalDateTime.now());
}
}
