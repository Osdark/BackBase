package com.zeroim.facades.query.buyer;

import com.zeroim.converter.Converter;
import com.zeroim.domain.buyer.IdType;
import com.zeroim.populators.Populator;
import com.zeroim.populators.buyer.IdTypeResponsePopulator;
import com.zeroim.ports.primary.buyer.IdTypeService;
import com.zeroim.requests.buyer.IdTypeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class DefaultIdTypeQueryFacade implements IdTypeQueryFacade {
    @Autowired
    private final IdTypeService service;

    public DefaultIdTypeQueryFacade(IdTypeService service) {
        this.service = service;
    }

    @Override
    public List<IdTypeDTO> getAll() {
        return convertIdTypeList(service.getAll());
    }

    @Override
    public IdTypeDTO getById(UUID id) {
        return convertIdType(service.getById(id));
    }

    private IdTypeDTO convertIdType(IdType idType) {
        Converter<IdType, IdTypeDTO> responseConverter = buildResponseConverter();
        return responseConverter.convert(idType);
    }

    private List<IdTypeDTO> convertIdTypeList(List<IdType> list) {
        Converter<IdType, IdTypeDTO> responseConverter = buildResponseConverter();
        return responseConverter.convertAll(list);
    }

    private Converter<IdType, IdTypeDTO> buildResponseConverter() {
        Populator<IdType, IdTypeDTO> responsePopulator = new IdTypeResponsePopulator();
        return Converter.of(IdTypeDTO.class).withPopulator(responsePopulator);
    }
}
