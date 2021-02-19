package com.cyclops.template.ports.primary;

import com.cyclops.template.domain.Greeting;

public interface HelloWorldService {

    Iterable<Greeting> getAllGreetings();

}
