package com.equitrack.backend.repositories;

import com.equitrack.backend.models.Portfolio;
import com.equitrack.backend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
    List<Portfolio> findByUser(User user);
    boolean  existsByUserAndName(User user, String name);


}
