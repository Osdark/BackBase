package com.zeroim.facades.query.bill;

import com.zeroim.requests.bill.BillDetailDTO;

import java.util.UUID;

public interface BillDetailQueryFacade {
    BillDetailDTO getById(UUID id);
}
