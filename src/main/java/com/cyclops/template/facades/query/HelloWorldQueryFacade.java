package com.cyclops.template.facades.query;

import com.cyclops.template.requests.GreetingDTO;

import java.util.List;

public interface HelloWorldQueryFacade {

    List<GreetingDTO> getAllGreetings();
}
