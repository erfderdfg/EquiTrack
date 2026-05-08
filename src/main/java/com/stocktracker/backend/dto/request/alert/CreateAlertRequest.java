package com.stocktracker.backend.dto.request.alert;

import com.stocktracker.backend.models.enums.ConditionType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateAlertRequest {
    @NotNull(message = "Instrument is required")
    private Long instrumentId;

    @NotNull(message = "Condition Type is Required")
    private ConditionType conditionType;
    @NotNull(message = "Threshold is required")
    @PositiveOrZero(message = "Threshold must be a positive value")
    private BigDecimal threshold;
}
