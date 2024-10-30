package com.example.crm.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class CustomerDto {

    @NotNull(message = "Full name is required")
    @NotBlank(message = "Full name cannot be blank")
    var fullName: String? = null

    @NotNull(message = "Email is required")
    @NotBlank(message = "Email cannot be blank")
    var email: String? = null
}