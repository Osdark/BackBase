package com.zeroim.ports.primary.bill;

import com.zeroim.domain.bill.BillDetail;
import com.zeroim.requests.bill.BillDetailDTO;

import java.util.List;
import java.util.UUID;

public interface BillDetailService {
    BillDetail getById(UUID id);

    BillDetail create(BillDetail billDetail);

    List<BillDetail> massiveCreation(List<BillDetail> billDetails);
}
