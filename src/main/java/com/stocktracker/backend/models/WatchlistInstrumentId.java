package com.stocktracker.backend.models;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@Embeddable
public class WatchlistInstrumentId implements Serializable {
    private Long watchlistId;
    private Long instrumentId;
}
