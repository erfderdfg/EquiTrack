package com.stocktracker.backend.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@Table(name = "positions")
public class Position {

    @EmbeddedId
    private PositionId id;

    @ManyToOne
    @MapsId("portfolioId")
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;

    @ManyToOne
    @MapsId("instrumentId")
    @JoinColumn(name = "instrument_id", nullable = false)
    private Instrument instrument;

    @Column(name = "qty", nullable = false)
    @NotNull(message = "Quantity is required")
    @PositiveOrZero(message = "Quantity cannot be negative")
    private BigDecimal qty;

    @Column(name = "avg_cost", nullable = false)
    @NotNull(message = "Average costs is required")
    @PositiveOrZero(message = "Average cost cannot be negative")
    private BigDecimal avgCost;

    @Column(name = "realized_pnl",nullable = false)
    @NotNull(message = "Realized pnl is required")
    private BigDecimal realizedPnl;
}
