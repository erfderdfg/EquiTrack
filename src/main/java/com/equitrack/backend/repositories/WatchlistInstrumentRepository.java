package com.equitrack.backend.repositories;


import com.equitrack.backend.models.Instrument;

import com.equitrack.backend.models.Watchlist;
import com.equitrack.backend.models.WatchlistInstrument;

import com.equitrack.backend.models.WatchlistInstrumentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WatchlistInstrumentRepository extends JpaRepository<WatchlistInstrument, WatchlistInstrumentId> {
    List<WatchlistInstrument> findByWatchlist(Watchlist watchlist);
    boolean existsByWatchlistAndInstrument(Watchlist watchlist, Instrument instrument);
}
