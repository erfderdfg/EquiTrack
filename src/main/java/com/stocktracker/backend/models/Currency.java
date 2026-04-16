package com.stocktracker.backend.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
@Data
@NoArgsConstructor
@Entity
@Table(name = "currency")
public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "currency", nullable = false, length = 3, columnDefinition =  "bpchar(3)")
    @NotBlank(message = "Currency is required")
    private String code;

    @Column(name = "name", nullable = false, length = 64)
    @NotBlank(message = "Name is required")
    private String name;

    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;

    @Column(name = "is_crypto", nullable = false)
    @NotNull(message = "Is crypto is required")
    private Boolean isCrypto;
}

