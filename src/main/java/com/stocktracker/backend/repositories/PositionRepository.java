package com.stocktracker.backend.repositories;


import com.stocktracker.backend.models.Instrument;
import com.stocktracker.backend.models.Portfolio;
import com.stocktracker.backend.models.Position;
import com.stocktracker.backend.models.PositionId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PositionRepository extends JpaRepository<Position, PositionId> {
    List<Position> findByPortfolio(Portfolio portfolio);
    Optional<Position> findByPortfolioAndInstrument(Portfolio portfolio, Instrument instrument);
}
