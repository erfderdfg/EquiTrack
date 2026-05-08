package com.stocktracker.backend.dto.response.watchlist;


import com.stocktracker.backend.dto.response.instrument.InstrumentResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WatchlistDetailResponse {
    private Long  watchlistId;
    private String  watchlistName;
    private List<InstrumentResponse> instruments;
}

