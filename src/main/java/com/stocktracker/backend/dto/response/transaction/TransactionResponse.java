package com.stocktracker.backend.dto.response.transaction;


import com.stocktracker.backend.models.enums.TransactionSide;
import com.stocktracker.backend.models.enums.TransactionStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionResponse {
    private Long transactionId;
    private Long instrumentId;
    private TransactionSide side;
    private BigDecimal qty;
    private BigDecimal fee;
    private OffsetDateTime tradeTs;
    private BigDecimal price;
    private TransactionStatus status;
}
