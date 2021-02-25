package com.cyclops.template.requests.greeting;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

@NoArgsConstructor
@Data
public class GreetingDTO extends RepresentationModel<GreetingDTO> {
    private int id;
    private String greeting;
}
