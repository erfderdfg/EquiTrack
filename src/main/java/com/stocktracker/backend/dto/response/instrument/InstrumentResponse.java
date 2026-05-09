package com.stocktracker.backend.dto.response.instrument;

import com.stocktracker.backend.models.enums.InstrumentType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstrumentResponse {
    private Long instrumentId;
    private String symbol;
    private String name;
    private InstrumentType type;
    private boolean isActive;
    private String currencyCode;
    private String exchangeName;
    private OffsetDateTime createdAt;
}
