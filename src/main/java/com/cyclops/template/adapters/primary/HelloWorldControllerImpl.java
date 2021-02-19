package com.cyclops.template.adapters.primary;

import com.cyclops.template.facades.query.HelloWorldQueryFacade;
import com.cyclops.template.ports.primary.HelloWorldController;
import com.cyclops.template.requests.GreetingDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldControllerImpl implements HelloWorldController {

    private static final Logger LOG = LoggerFactory.getLogger(HelloWorldControllerImpl.class);

    @Autowired
    private HelloWorldQueryFacade helloWorldQueryFacade;

    public HelloWorldControllerImpl(HelloWorldQueryFacade helloWorldQueryFacade) {
        this.helloWorldQueryFacade = helloWorldQueryFacade;
    }

    @Override
    public List<GreetingDTO> getAllGreetings() {
        LOG.info("Getting all greetings ...");
        return helloWorldQueryFacade.getAllGreetings();
    }
}
