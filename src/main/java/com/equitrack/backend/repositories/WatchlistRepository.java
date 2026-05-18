package com.equitrack.backend.repositories;

import com.equitrack.backend.models.User;
import com.equitrack.backend.models.Watchlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WatchlistRepository extends JpaRepository<Watchlist, Long> {
    List<Watchlist> findByUser(User user);
    boolean existsByUserAndName(User user, String name);

}
