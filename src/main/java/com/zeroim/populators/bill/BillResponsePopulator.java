package com.zeroim.populators.bill;

import com.zeroim.domain.bill.Bill;
import com.zeroim.populators.Populator;
import com.zeroim.requests.bill.BillDTO;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BillResponsePopulator implements Populator<Bill, BillDTO> {
    @Override
    public void populate(Bill bill, BillDTO billDTO) {
        billDTO.setId(bill.getId());
        billDTO.setBillDetail(Arrays.stream(bill.getBillDetail()).collect(Collectors.toList()));
        billDTO.setClientId(bill.getClientId());
        billDTO.setDate(bill.getDate());
        billDTO.setTotal(bill.getTotal());
        billDTO.setPaidOut(bill.isPaidOut());
    }
}
