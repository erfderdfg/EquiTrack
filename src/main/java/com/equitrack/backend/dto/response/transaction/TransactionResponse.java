package com.equitrack.backend.dto.response.transaction;


import com.equitrack.backend.models.enums.TransactionSide;
import com.equitrack.backend.models.enums.TransactionStatus;
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
