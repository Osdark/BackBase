package com.cyclops.template.facades.query.greeting;

import com.cyclops.template.converter.Converter;
import com.cyclops.template.domain.greeting.Greeting;
import com.cyclops.template.populators.Populator;
import com.cyclops.template.populators.greeting.GreetingOutgoingPopulator;
import com.cyclops.template.ports.primary.greeting.HelloWorldService;
import com.cyclops.template.requests.greeting.GreetingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HelloWorldQueryFacadeImpl implements HelloWorldQueryFacade {

    @Autowired
    private HelloWorldService helloWorldService;

    public HelloWorldQueryFacadeImpl(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @Override
    public List<GreetingDTO> getAllGreetings() {
        return convertGreetings(helloWorldService.getAllGreetings());
    }

    private List<GreetingDTO> convertGreetings(Iterable<Greeting> greetings){
        Converter<Greeting, GreetingDTO> outgoingConverter = buildOutgoingConverter();

        return outgoingConverter.convertAll(greetings);
    }

    private Converter<Greeting, GreetingDTO> buildOutgoingConverter(){
        Populator<Greeting, GreetingDTO> outgoingPopulator = new GreetingOutgoingPopulator();
        Converter<Greeting, GreetingDTO> outgoingConverter = Converter.of(GreetingDTO.class).withPopulator(outgoingPopulator);

        return outgoingConverter;
    }
}
