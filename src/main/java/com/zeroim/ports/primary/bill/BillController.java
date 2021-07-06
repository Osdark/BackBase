package com.zeroim.ports.primary.bill;

import com.zeroim.requests.bill.BillDTO;
import com.zeroim.requests.bill.CreateBillDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;

@RequestMapping("/bill")
public interface BillController {
    @PostMapping
    ResponseEntity<BillDTO> create(CreateBillDTO createBillDTO);

    @GetMapping
    ResponseEntity<List<BillDTO>> getAll();

    @GetMapping("/getById")
    ResponseEntity<BillDTO> getById(@RequestParam("id") UUID id);
}
