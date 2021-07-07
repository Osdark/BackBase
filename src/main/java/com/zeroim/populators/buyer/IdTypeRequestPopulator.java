package com.zeroim.populators.buyer;

import com.zeroim.domain.buyer.IdType;
import com.zeroim.populators.Populator;
import com.zeroim.requests.buyer.IdTypeDTO;

public class IdTypeRequestPopulator implements Populator<IdTypeDTO, IdType> {
    @Override
    public void populate(IdTypeDTO idTypeDTO, IdType idType) {
        idType.setId(idTypeDTO.getId());
        idType.setAbbreviation(idTypeDTO.getAbbreviation());
        idType.setName(idTypeDTO.getName());
    }
}
