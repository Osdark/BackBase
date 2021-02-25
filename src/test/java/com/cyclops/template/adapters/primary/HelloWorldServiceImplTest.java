package com.cyclops.template.adapters.primary;

import com.cyclops.template.ports.primary.greeting.HelloWorldService;
import com.cyclops.template.ports.secondary.greeting.HelloWorldRepository;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class HelloWorldServiceImplTest {

    private HelloWorldRepository helloWorldRepository = mock(HelloWorldRepository.class);
    private HelloWorldService subjectUnderTest = new HelloWorldServiceImpl(helloWorldRepository);

    @Test
    public void shouldGetAllGreetings(){
        subjectUnderTest.getAllGreetings();

        verify(helloWorldRepository).findAll();
    }

}