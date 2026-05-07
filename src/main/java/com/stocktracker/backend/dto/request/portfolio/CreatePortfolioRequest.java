package com.stocktracker.backend.dto.request.portfolio;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CreatePortfolioRequest {
    @NotBlank(message = "Name is required")
    private String name;
    @Pattern(regexp = "^[A-Z]{3}$", message = "Currency code must be 3 uppercase letters")
    private String currencyCode;
}
