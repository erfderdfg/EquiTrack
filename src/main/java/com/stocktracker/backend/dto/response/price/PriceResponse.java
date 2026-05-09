package com.stocktracker.backend.dto.response.price;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PriceResponse {
    private Long instrumentId;
    private BigDecimal price;
    private BigDecimal close;
    private BigDecimal volume;
    private OffsetDateTime timestamp;
    private String source;
}
