package com.cyclops.template.ports.primary.greeting;

import com.cyclops.template.requests.greeting.GreetingDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/greetings")
public interface HelloWorldController {

    @GetMapping
    List<GreetingDTO> getAllGreetings();
}
