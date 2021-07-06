package com.zeroim.populators.bill;

import com.zeroim.domain.bill.Bill;
import com.zeroim.populators.Populator;
import com.zeroim.requests.bill.BillDTO;

public class BillRequestPopulator implements Populator<BillDTO, Bill> {
    @Override
    public void populate(BillDTO billDTO, Bill bill) {
        bill.setId(billDTO.getId());
        bill.setBillDetail(billDTO.getBillDetail());
        bill.setClientId(billDTO.getClientId());
        bill.setDate(billDTO.getDate());
        bill.setTotal(billDTO.getTotal());
        bill.setPaidOut(billDTO.isPaidOut());
    }
}
