package com.zeroim.facades.command.bill;

import com.zeroim.requests.bill.BillDetailDTO;

import java.util.List;

public interface BillDetailCommandFacade {
    BillDetailDTO create(BillDetailDTO billDetailDTO);

    List<BillDetailDTO> massiveCreation(List<BillDetailDTO> billDetails);
}
