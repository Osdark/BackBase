package com.cyclops.template.facades.query.greeting;

import com.cyclops.template.requests.greeting.GreetingDTO;

import java.util.List;

public interface HelloWorldQueryFacade {

    List<GreetingDTO> getAllGreetings();
}
