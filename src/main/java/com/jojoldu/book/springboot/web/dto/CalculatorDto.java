package com.jojoldu.book.springboot.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class CalculatorDto {
    private int a;
    private  int b;

    public int add(){
        return a+b;
    }
    public int subtract(){
        return a-b;
    }
}
