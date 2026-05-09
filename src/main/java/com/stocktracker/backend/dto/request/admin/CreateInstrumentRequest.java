package com.stocktracker.backend.dto.request.admin;


import com.stocktracker.backend.models.enums.InstrumentType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

//Doar Admin- ul voi pune ca poate adauga instrumente.
public class CreateInstrumentRequest {
    @NotBlank(message = "Symbol is required")
    private String symbol;
    @NotBlank(message = "Name is required")
    private String name;
    @NotNull(message = "Instrument type is required")
    private InstrumentType type;
    @NotNull(message = "Currency is required")
    private Long currencyId;
    @NotNull(message = "Exchange is required")
    private Long exchangeId;
}
