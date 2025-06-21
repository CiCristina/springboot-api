package com.microservico.springboot.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    @NotEmpty (message = "Name is required")
    private String name;
    @NotEmpty (message = "Email is required")
    private String email;

}
