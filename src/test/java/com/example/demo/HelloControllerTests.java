package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(HelloController.class)
public class HelloControllerTests {
    @Autowired
    MockMvc mockMvc;

    @Test
    void sayHello_noParents_rtnHelloWorld() throws Exception {
        // hello string "Hello World"
        //Act
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World"));
    }
    @Test
    void sayHello_myName_rtnHelloName () throws Exception {
        mockMvc.perform(get("/hello?name=David"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello David"));
    }
}
