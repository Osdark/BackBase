package com.cyclops.template.ports.primary.greeting;

import com.cyclops.template.domain.greeting.Greeting;

public interface HelloWorldService {

    Iterable<Greeting> getAllGreetings();

}
