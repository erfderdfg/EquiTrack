package com.stocktracker.backend.dto.response.alert;
import com.stocktracker.backend.dto.response.instrument.InstrumentResponse;
import com.stocktracker.backend.models.enums.ConditionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlertResponse {
    private Long id;
    private boolean isActive;
    private OffsetDateTime lastTriggeredAt;
    private InstrumentResponse instrument;
    private ConditionType conditionType;
    private BigDecimal threshold;
}
