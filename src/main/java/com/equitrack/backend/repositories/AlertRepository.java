package com.equitrack.backend.repositories;


import com.equitrack.backend.models.Alert;

import com.equitrack.backend.models.Instrument;
import com.equitrack.backend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface AlertRepository extends JpaRepository<Alert, Long> {
    List<Alert> findByInstrumentAndIsActiveTrue(Instrument instrument);
    List<Alert> findByUser(User user);
    List<Alert> findByUserAndIsActiveTrue(User user);

}
