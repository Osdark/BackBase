package com.zeroim.adapters.bill;

import com.zeroim.ports.primary.bill.BillController;
import com.zeroim.requests.bill.BillDTO;
import com.zeroim.requests.bill.CreateBillDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public class DefaultBillController implements BillController {
    @Override
    public ResponseEntity<BillDTO> create(CreateBillDTO createBillDTO) {
        return null;
    }

    @Override
    public ResponseEntity<List<BillDTO>> getAll() {
        return null;
    }

    @Override
    public ResponseEntity<BillDTO> getById(UUID id) {
        return null;
    }
}
