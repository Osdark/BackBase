package com.zeroim.ports.primary.bill;

import com.zeroim.domain.bill.Bill;

import java.util.List;
import java.util.UUID;

public interface BillService {
    Bill create(Bill bill);

    List<Bill> getAll();

    Bill getById(UUID id);
}
