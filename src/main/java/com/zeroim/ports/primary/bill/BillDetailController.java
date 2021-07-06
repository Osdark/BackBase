package com.zeroim.ports.primary.bill;

import com.zeroim.requests.bill.BillDetailDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;

@RequestMapping("/bill")
public interface BillDetailController {
    @GetMapping("/getById")
    BillDetailDTO getById(@RequestParam("id") UUID id);
}
