package com.cyclops.template.populators.greeting;

import com.cyclops.template.domain.Greeting;
import com.cyclops.template.populators.Populator;
import com.cyclops.template.requests.GreetingDTO;

public class GreetingIncomingPopulator implements Populator<GreetingDTO, Greeting> {

    @Override
    public void populate(GreetingDTO greetingDTO, Greeting greeting) {
        greeting.setId(greetingDTO.getId());
        greeting.setGreeting(greetingDTO.getGreeting());
    }
}
