package com.zeroim.domain.buyer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Buyer {
    private String idNumber;
    private UUID idType;
    private String name;
    private String address;
    private String phone;
}
