package com.stocktracker.backend.repositories;

import com.stocktracker.backend.models.User;
import com.stocktracker.backend.models.Watchlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WatchlistRepository extends JpaRepository<Watchlist, Long> {
    List<Watchlist> findByUser(User user);
    boolean existsByUserAndName(User user, String name);

}
