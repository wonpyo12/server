package com.jojoldu.book.springboot.web.Dto;


import com.jojoldu.book.springboot.web.dto.CalculatorDto;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.StatusResultMatchersExtensionsKt.isEqualTo;

public class CalculatorDtoTest {
    @Test
    public void add(){
        CalculatorDto dto = CalculatorDto.builder()
                .a(10)
                .b(3)
                .build();
        int result = dto.add();
        assertThat(result).isEqualTo(13);

    }


    @Test
    public void subtract() {
        CalculatorDto dto = CalculatorDto.builder()
                .a(10)
                .b(3)
                .build();

        int result = dto.subtract();
        assertThat(result).isEqualTo(7);
    }
}
