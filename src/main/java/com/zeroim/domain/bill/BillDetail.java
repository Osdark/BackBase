package com.zeroim.domain.bill;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillDetail {
    @Id
    private UUID id;
    private UUID productId;
    private Integer quantity;
    private BigDecimal value;
}
