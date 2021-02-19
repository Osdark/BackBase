package com.cyclops.template.adapters.primary;

import com.cyclops.template.domain.Greeting;
import com.cyclops.template.ports.primary.HelloWorldService;
import com.cyclops.template.ports.secondary.HelloWorldRepository;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldServiceImpl implements HelloWorldService {

    private HelloWorldRepository helloWorldRepository;

    public HelloWorldServiceImpl(HelloWorldRepository helloWorldRepository) {
        this.helloWorldRepository = helloWorldRepository;
    }

    public Iterable<Greeting> getAllGreetings() {
        return helloWorldRepository.findAll();
    }
}