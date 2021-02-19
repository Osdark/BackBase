package com.cyclops.template.populators.greeting;

import com.cyclops.template.domain.Greeting;
import com.cyclops.template.populators.Populator;
import com.cyclops.template.requests.GreetingDTO;

public class GreetingOutgoingPopulator implements Populator<Greeting, GreetingDTO> {

    @Override
    public void populate(Greeting greeting, GreetingDTO greetingDTO) {
        greetingDTO.setId(greeting.getId());
        greetingDTO.setGreeting(greeting.getGreeting());
    }
}
