package com.zeroim.adapters.bill;

import com.zeroim.domain.bill.BillDetail;
import com.zeroim.ports.primary.bill.BillDetailService;
import com.zeroim.ports.secondary.bill.BillDetailRepo;
import com.zeroim.requests.bill.BillDetailDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class DefaultBillDetailService implements BillDetailService {
    private final BillDetailRepo repo;

    public DefaultBillDetailService(BillDetailRepo repo) {
        this.repo = repo;
    }

    @Override
    public BillDetail getById(UUID id) {
        return repo.findById(id).get();
    }

    @Override
    public BillDetail create(BillDetail billDetail) {
        return repo.save(billDetail);
    }

    @Override
    public List<BillDetail> massiveCreation(List<BillDetail> billDetails) {
        Iterable<BillDetail> billDetailIterable = billDetails;
        billDetailIterable = repo.saveAll(billDetailIterable);
        return StreamSupport.stream(billDetailIterable.spliterator(), false)
                .collect(Collectors.toList());
    }
}
