package com.cyclops.template.facades.query;

import com.cyclops.template.ports.primary.HelloWorldService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class HelloWorldQueryFacadeTest {

    private HelloWorldService helloWorldService = mock(HelloWorldService.class);
    private HelloWorldQueryFacade subjectUnderTest = new HelloWorldQueryFacadeImpl(helloWorldService);

    @Test
    public void shouldGetAllGreetings(){
        subjectUnderTest.getAllGreetings();

        verify(helloWorldService).getAllGreetings();
    }
}