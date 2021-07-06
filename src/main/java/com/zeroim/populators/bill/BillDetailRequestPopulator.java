package com.zeroim.populators.bill;

import com.zeroim.domain.bill.BillDetail;
import com.zeroim.populators.Populator;
import com.zeroim.requests.bill.BillDetailDTO;

public class BillDetailRequestPopulator implements Populator<BillDetailDTO, BillDetail> {
    @Override
    public void populate(BillDetailDTO billDetailDTO, BillDetail billDetail) {
        billDetail.setId(billDetailDTO.getId());
        billDetail.setQuantity(billDetailDTO.getQuantity());
        billDetail.setProductId(billDetailDTO.getProductId());
        billDetail.setValue(billDetailDTO.getValue());
    }
}
