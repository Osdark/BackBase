package com.zeroim.integrations;

import com.cyclops.zeroim.domain.greeting.Greeting;
import com.cyclops.zeroim.ports.secondary.greeting.HelloWorldRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
@SpringBootTest
public class HelloWorldControllerImplIntegrationTest {

    @Autowired
    private HelloWorldRepository helloWorldRepository;

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    public void setup(){
        Greeting greeting = new Greeting();
        greeting.setGreeting("How are you!");

        helloWorldRepository.save(greeting);
    }

    @Test
    public void shouldGetAllGreetings() throws Exception{
        mockMvc.perform(
                get("/greetings")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}
