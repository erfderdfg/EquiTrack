package com.stocktracker.backend.dto.response.watchlist;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WatchlistResponse {
    private Long id;
    private String name;
    
}
