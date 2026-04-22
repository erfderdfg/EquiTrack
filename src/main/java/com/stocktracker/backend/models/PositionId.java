package com.stocktracker.backend.models;


import jakarta.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
@Embeddable
public class PositionId implements Serializable {
    private Long portfolioId;
    private Long instrumentId;
}
