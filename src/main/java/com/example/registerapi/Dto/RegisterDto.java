package com.example.registerapi.Dto;

import com.sun.istack.NotNull;
import lombok.*;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class RegisterDto {

    @NotBlank(message = "Name is mandatory")
    @NotNull
    private String name;

    @NotBlank(message = "Email is mandatory")
    @NotNull
    private String email;

    @NotBlank(message = "Password is mandatory")
    @NotNull
    private String password;
}
