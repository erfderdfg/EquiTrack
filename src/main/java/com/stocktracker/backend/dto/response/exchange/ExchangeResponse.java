package com.stocktracker.backend.dto.response.exchange;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeResponse {
    private Long id;
    private String name;
    private String timeZone;
    private OffsetDateTime createdAt;
}
