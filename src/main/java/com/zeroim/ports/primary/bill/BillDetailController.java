package com.zeroim.ports.primary.bill;

import com.zeroim.requests.bill.BillDetailDTO;
import com.zeroim.requests.util.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;

@RequestMapping("/admin/billDetail")
public interface BillDetailController {
    @GetMapping("/getById")
    ResponseEntity<Response<BillDetailDTO>> getById(@RequestParam("id") UUID id);
}
