package com.jojoldu.book.springboot.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = EchoController.class)
public class EchoControllerTest {
    @Autowired
    private MockMvc mvc;
    @Test
    public void spring_gnirps() throws Exception{
        mvc.perform(get("/echo/spring"))
                .andExpect(status().isOk())
                .andExpect(content().string("gnirps"));

    }
}
