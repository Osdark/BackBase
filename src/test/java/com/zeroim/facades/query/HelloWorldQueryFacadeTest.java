package com.zeroim.facades.query;

import com.cyclops.zeroim.facades.query.greeting.HelloWorldQueryFacade;
import com.cyclops.zeroim.facades.query.greeting.HelloWorldQueryFacadeImpl;
import com.cyclops.zeroim.ports.primary.greeting.HelloWorldService;
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