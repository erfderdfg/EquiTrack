package com.stocktracker.backend.repositories;

import com.stocktracker.backend.models.Exchange;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExchangeRepository extends JpaRepository<Exchange, Long> {
    Optional <Exchange> findByName(String name);
    boolean existsByName(String name);
}
