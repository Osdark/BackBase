package com.zeroim.facades.command.buyer;

import com.zeroim.requests.buyer.IdTypeDTO;

import java.util.UUID;

public interface IdTypeCommandFacade {
    IdTypeDTO create(IdTypeDTO idTypeDTO);

    int delete(UUID id);
}
