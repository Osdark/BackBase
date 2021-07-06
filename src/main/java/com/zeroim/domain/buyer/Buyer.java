package com.zeroim.domain.buyer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Buyer {
    private Long idNumber;
    private Long idType;
    private String name;
    private String address;
    private String phone;
}
