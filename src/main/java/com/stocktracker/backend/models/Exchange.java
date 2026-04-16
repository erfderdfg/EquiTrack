package com.stocktracker.backend.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "exchange")
public class Exchange {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    @NotBlank(message = "Name is required")
    private String name;

    @Column(name = "timezone", nullable = false , length = 50)
    @NotBlank(message = "Time zone is required")
    private String timezone;

    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;
}
