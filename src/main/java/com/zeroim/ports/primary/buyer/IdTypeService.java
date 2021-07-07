package com.zeroim.ports.primary.buyer;

import com.zeroim.domain.buyer.IdType;

import java.util.List;
import java.util.UUID;

public interface IdTypeService {
    IdType create(IdType idType);

    List<IdType> getAll();

    IdType getById(UUID id);

    int delete(UUID id);
}
