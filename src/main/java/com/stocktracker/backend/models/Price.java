package com.stocktracker.backend.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "prices")
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "instrument_id", nullable = false)
    private Instrument instrument;

    @Column(name = "price", nullable = false)
    @Positive(message = "Price must be positive")
    @NotNull(message = "Price is required")
    private BigDecimal price;

    @Column(name = "close")
    @Positive(message = "Close price must be positive")
    private BigDecimal close;

    @Column(name = "volume")
    @Positive(message = "Volume cannot be negative")
    private BigDecimal volume;

    @Column(name = "ts", nullable = false)
    @NotNull(message = "Timestamp is required")
    private OffsetDateTime timestamp;

    @Column(name = "source", nullable = false, length = 50)
    private String source;
}

