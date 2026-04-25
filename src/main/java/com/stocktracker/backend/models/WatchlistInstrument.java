package com.stocktracker.backend.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "watchlist_instruments")

//Orice entitate trebuie să aibă o cheie primară reprezentată ca obiect Java!
public class WatchlistInstrument {

    @EmbeddedId
    private WatchlistInstrumentId id;

    @ManyToOne
    @MapsId("watchlistId")
    @JoinColumn(name = "watchlist_id")
    private Watchlist watchlist;

    @ManyToOne
    @MapsId("instrumentId")
    @JoinColumn(name ="instrument_id")
    private Instrument instrument;
}
