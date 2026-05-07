package com.stocktracker.backend.dto.response.position;

import com.stocktracker.backend.dto.response.instrument.InstrumentResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PositionResponse {
    private Long portfolioId;
    private InstrumentResponse instrument;
    private BigDecimal qty;
    private BigDecimal averageCost;
    private BigDecimal realizedPNL;
}
