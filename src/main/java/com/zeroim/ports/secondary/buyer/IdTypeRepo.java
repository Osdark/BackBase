package com.zeroim.ports.secondary.buyer;

import com.zeroim.domain.buyer.IdType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IdTypeRepo extends CrudRepository<IdType, UUID> {
}
