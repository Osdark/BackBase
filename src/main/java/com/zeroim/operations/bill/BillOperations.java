package com.zeroim.operations.bill;

import com.zeroim.requests.bill.BillDTO;
import com.zeroim.requests.bill.CreateBillDTO;

public interface BillOperations {
    BillDTO createBill(CreateBillDTO billDTO);
}
