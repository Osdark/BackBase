package com.zeroim.populators.buyer;

import com.zeroim.domain.buyer.IdType;
import com.zeroim.populators.Populator;
import com.zeroim.requests.buyer.IdTypeDTO;

public class IdTypeResponsePopulator implements Populator<IdType, IdTypeDTO> {
    @Override
    public void populate(IdType idType, IdTypeDTO idTypeDTO) {
        idTypeDTO.setId(idType.getId());
        idTypeDTO.setAbbreviation(idType.getAbbreviation());
        idTypeDTO.setName(idType.getName());
    }
}
