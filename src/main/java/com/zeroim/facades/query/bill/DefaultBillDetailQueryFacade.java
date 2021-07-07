package com.zeroim.facades.query.bill;

import com.zeroim.converter.Converter;
import com.zeroim.domain.bill.BillDetail;
import com.zeroim.populators.Populator;
import com.zeroim.populators.bill.BillDetailResponsePopulator;
import com.zeroim.ports.primary.bill.BillDetailService;
import com.zeroim.requests.bill.BillDetailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Convert;
import java.util.UUID;

@Component
public class DefaultBillDetailQueryFacade implements BillDetailQueryFacade {
    @Autowired
    private final BillDetailService service;

    public DefaultBillDetailQueryFacade(BillDetailService service) {
        this.service = service;
    }

    @Override
    public BillDetailDTO getById(UUID id) {
        return convertBillDetail(service.getById(id));
    }

    private BillDetailDTO convertBillDetail(BillDetail billDetail) {
        Converter<BillDetail, BillDetailDTO> responseConverter = buildResponseConverter();
        return responseConverter.convert(billDetail);
    }

    private Converter<BillDetail, BillDetailDTO> buildResponseConverter() {
        Populator<BillDetail, BillDetailDTO> responsePopulator = new BillDetailResponsePopulator();
        return Converter.of(BillDetailDTO.class).withPopulator(responsePopulator);
    }
}
