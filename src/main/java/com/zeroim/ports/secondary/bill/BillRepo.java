package com.zeroim.ports.secondary.bill;

import com.zeroim.domain.bill.Bill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BillRepo extends CrudRepository<Bill, UUID> {
}
