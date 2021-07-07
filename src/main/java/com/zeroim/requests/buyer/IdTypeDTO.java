package com.zeroim.requests.buyer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IdTypeDTO {
    private UUID id;
    private String abbreviation;
    private String name;
}
