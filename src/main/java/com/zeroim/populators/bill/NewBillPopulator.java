package com.zeroim.populators.bill;

import com.zeroim.domain.bill.Bill;
import com.zeroim.populators.Populator;
import com.zeroim.requests.bill.NewBillDTO;

import java.util.UUID;

public class NewBillPopulator implements Populator<NewBillDTO, Bill> {
    @Override
    public void populate(NewBillDTO newBillDTO, Bill bill) {
        bill.setId(UUID.randomUUID());
        bill.setDate(newBillDTO.getDate());
        bill.setClientId(newBillDTO.getClientId());
        bill.setTotal(newBillDTO.getTotal());
        bill.setPaidOut(false);
    }
}
