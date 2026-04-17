package com.stocktracker.backend.models;


import com.stocktracker.backend.models.enums.InstrumentType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.OffsetDateTime;

@Entity
@Table(name = "instruments")
@Data
@NoArgsConstructor
public class Instrument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "symbol", nullable = false, length = 100)
    @NotBlank(message = "Symbol is required")
    private String symbol;

    @Column(name = "name", nullable = false, length = 100)
    @NotBlank(message = "Name is required")
    private String name;

    @Column(name = "type", nullable = false, length = 20)
    @NotNull(message = "Type is required")
    @Enumerated(EnumType.STRING)
    private InstrumentType type;

    @Column(name = "is_active", nullable = false)
    private boolean isActive = true;

    @ManyToOne
    @JoinColumn(name = "currency_id",nullable = false)
    private Currency currency;

    @ManyToOne
    @JoinColumn(name = "exchange_id", nullable = false)
    private Exchange exchange;

    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;

}
