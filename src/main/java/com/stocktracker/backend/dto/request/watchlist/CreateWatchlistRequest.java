package com.stocktracker.backend.dto.request.watchlist;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateWatchlistRequest {
    @NotBlank(message = "name is required")
    private String name;
}
