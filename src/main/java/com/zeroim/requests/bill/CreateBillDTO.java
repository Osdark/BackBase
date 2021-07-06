package com.zeroim.requests.bill;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBillDTO {
    BillDTO billDTO;
    List<BillDetailDTO> billDetailDTOS;
}
