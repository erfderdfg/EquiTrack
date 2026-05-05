package com.stocktracker.backend.repositories;


import com.stocktracker.backend.models.Instrument;
import com.stocktracker.backend.models.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {
    Optional<Price> findTopByInstrument_IdOrderByTimestampDesc(Instrument instrument);
    List<Price>  findByInstrument_IdOrderByTimestampAsc(Instrument instrument);

}
