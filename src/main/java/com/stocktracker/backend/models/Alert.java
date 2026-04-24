package com.stocktracker.backend.models;


import com.stocktracker.backend.models.enums.ConditionType;
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
@Table(name = "alerts")
public class Alert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "instrument_id", nullable = false)
    private Instrument instrument;

    @Column(name = "condition_type",nullable = false, length = 20 )
    @NotNull(message = "Condition is required")
    @Enumerated(EnumType.STRING)
    private ConditionType conditionType;

    @Column(name = "threshold", nullable = false)
    @NotNull(message = "Threshold is required")
    @Positive(message = "Threshold must be positive")
    private BigDecimal threshold;

    @Column(name = "is_active", nullable = false)
    @NotNull(message = "Is active is required")
    private Boolean isActive;

    @Column(name = "last_trigered_at")
    private OffsetDateTime lastTrigeredAt;
}
