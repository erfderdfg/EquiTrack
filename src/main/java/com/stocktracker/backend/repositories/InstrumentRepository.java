package com.stocktracker.backend.repositories;

import com.stocktracker.backend.models.Exchange;
import com.stocktracker.backend.models.Instrument;
import com.stocktracker.backend.models.enums.InstrumentType;
import jakarta.persistence.metamodel.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface InstrumentRepository extends JpaRepository<Instrument, Long> {
    List<Instrument> findBySymbol(String symbol);
    boolean existsBySymbolAndExchange(String symbol, Exchange exchange);
    Type<Instrument> findByType(InstrumentType type);
}
