package com.stocktracker.backend.dto.request.user;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProfileRequest {
    @Size(max = 50, message = "First name must be less than 50 Characters")
    private String  firstName;
    @Size(max = 50, message = "Last Name must be less than 50 Characters")
    private String  lastName;
    @Pattern(regexp = "^\\+?[1-9]\\d{7,14}$", message = "Phone number is Invalid.")
    private String phone;
}
