package com.stocktracker.backend.models;

import com.stocktracker.backend.models.enums.TransactionSide;
import com.stocktracker.backend.models.enums.TransactionStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;

    @ManyToOne
    @JoinColumn(name = "instrument_id", nullable = false)
    private Instrument instrument;

    @Column(name = "side", nullable = false, length = 4)
    @NotNull(message = "Side is required")
    @Enumerated(EnumType.STRING)
    private TransactionSide side;

    @Column(name = "qty", nullable = false)
    @NotNull(message = "Quantity is required")
    @Positive(message = "Quanitity must be positive")
    private BigDecimal qty;

    @Column(name = "fee", nullable = false)
    @NotNull(message = "Fee is required")
    @PositiveOrZero(message = "Fee cannot be negative")
    private BigDecimal fee;

    @Column(name = "trade_ts", nullable = false)
    private OffsetDateTime tradeTs;

    @Column(name = "price", nullable = false)
    @NotNull(message = "Price is required")
    @Positive(message = "Price must be postive")
    private BigDecimal price;

    @Column(name = "status", nullable = false, length = 20)
    @NotNull(message = "Status is required")
    @Enumerated(EnumType.STRING)
    private TransactionStatus status;
}
