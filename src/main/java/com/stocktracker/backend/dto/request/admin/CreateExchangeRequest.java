package com.stocktracker.backend.dto.request.admin;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//Exchange pentru admin ca sa poata adauga exchange ul
public class CreateExchangeRequest {
    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "TimeZone is required")
    private String timeZone;
}
