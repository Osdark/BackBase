package com.zeroim.domain.bill;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bill {
    @Id
    private UUID id;
    private Date date;
    private Long clientId;
    private Long[] billDetail;
    private BigDecimal total;
    private boolean paidOut;
}
