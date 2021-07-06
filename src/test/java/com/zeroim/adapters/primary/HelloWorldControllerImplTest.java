package com.zeroim.adapters.primary;

import com.cyclops.zeroim.facades.query.greeting.HelloWorldQueryFacade;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class HelloWorldControllerImplTest {


    private HelloWorldQueryFacade helloWorldQueryFacade = mock(HelloWorldQueryFacade.class);
    private HelloWorldControllerImpl subjectUnderTest = new HelloWorldControllerImpl(helloWorldQueryFacade);

    @Test
    public void shouldGetAll(){
        subjectUnderTest.getAllGreetings();

        verify(helloWorldQueryFacade).getAllGreetings();
    }
}