package com.stocktracker.backend.dto.response.currency;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyResponse {
    private Long id;
    private String code;
    private String name;
    private String isCrypto;
}
