package com.zeroim.domain.buyer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IdType {
    private Long id;
    private String abbreviation;
    private String name;
}
