package com.cyclops.template.ports.secondary.greeting;

import com.cyclops.template.domain.greeting.Greeting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloWorldRepository extends CrudRepository<Greeting, Long> {

}
