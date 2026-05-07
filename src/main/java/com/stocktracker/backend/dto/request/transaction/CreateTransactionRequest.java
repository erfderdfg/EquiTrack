package com.stocktracker.backend.dto.request.transaction;

import com.stocktracker.backend.models.enums.TransactionSide;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTransactionRequest {
    @NotNull(message = "PortfolioId is required")
    private Long portfolioId;
    @NotNull(message = "IntrumentId is required")
    private Long instrumentId;
    @NotNull(message = "Side is required")
    private TransactionSide side;
    @NotNull(message = "Quantity is required")
    @Positive(message = "The value can not be negative or zero")
    private BigDecimal qty;
    @NotNull(message = "Fee is required")
    @PositiveOrZero(message = "Fee can not be negative")
    private BigDecimal fee;
    @NotNull(message = "Trade Date and Time is Required")
    private OffsetDateTime tradeTs;
}
