package com.zeroim.contracts;

import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactFolder;
import au.com.dius.pact.provider.junit5.HttpTestTarget;
import au.com.dius.pact.provider.junit5.PactVerificationContext;
import au.com.dius.pact.provider.junit5.PactVerificationInvocationContextProvider;
import com.cyclops.zeroim.domain.greeting.Greeting;
import com.cyclops.zeroim.ports.secondary.greeting.HelloWorldRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT, properties = "server.port=8080")
@Provider("HelloWorldProvider")
@PactFolder("pacts")
public class HelloWorldContractTest {

    @MockBean
    private HelloWorldRepository helloWorldRepository;

    @BeforeEach
    public void setup(PactVerificationContext context){
        context.setTarget(new HttpTestTarget("localhost", 8080, "/"));
    }

    @TestTemplate
    @ExtendWith(PactVerificationInvocationContextProvider.class)
    void pactVerificationTestTemplate(PactVerificationContext context) {
        context.verifyInteraction();
    }

    @State("GetAllGreetings")
    public void getAll()
    {
        List<Greeting> greetings = new ArrayList<>();

        Greeting greeting = new Greeting();
        greeting.setId(1);
        greeting.setGreeting("Hello");

        greetings.add(greeting);

        when(helloWorldRepository.findAll()).thenReturn(greetings);
    }
}
