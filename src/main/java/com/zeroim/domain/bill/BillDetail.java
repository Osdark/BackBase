package com.zeroim.domain.bill;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillDetail {
    private UUID id;
    private Long productId;
    private Integer quantity;
    private BigDecimal value;
}
