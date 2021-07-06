package com.zeroim.populators.bill;

import com.zeroim.domain.bill.BillDetail;
import com.zeroim.populators.Populator;
import com.zeroim.requests.bill.BillDetailDTO;

public class BillDetailResponsePopulator implements Populator<BillDetail, BillDetailDTO> {
    @Override
    public void populate(BillDetail billDetail, BillDetailDTO billDetailDTO) {
        billDetailDTO.setId(billDetail.getId());
        billDetailDTO.setQuantity(billDetail.getQuantity());
        billDetailDTO.setProductId(billDetail.getProductId());
        billDetailDTO.setValue(billDetail.getValue());
    }
}
