package com.zeroim.facades.query.bill;

import com.zeroim.requests.bill.BillDTO;

import java.util.List;
import java.util.UUID;

public interface BillQueryFacade {
    BillDTO getById(UUID id);

    List<BillDTO> getAll();
}
