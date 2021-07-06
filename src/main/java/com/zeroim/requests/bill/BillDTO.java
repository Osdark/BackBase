package com.zeroim.requests.bill;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillDTO {
    private UUID id;
    private Date date;
    private Long clientId;
    private Long[] billDetail;
    private BigDecimal total;
    private boolean paidOut;
}