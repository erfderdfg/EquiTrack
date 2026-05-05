package com.stocktracker.backend.repositories;


import com.stocktracker.backend.models.Instrument;

import com.stocktracker.backend.models.Watchlist;
import com.stocktracker.backend.models.WatchlistInstrument;

import com.stocktracker.backend.models.WatchlistInstrumentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WatchlistInstrumentRepository extends JpaRepository<WatchlistInstrument, WatchlistInstrumentId> {
    List<WatchlistInstrument> findByWatchlist(Watchlist watchlist);
    boolean existsByWatchlistAndInstrument(Watchlist watchlist, Instrument instrument);
}
