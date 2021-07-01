package com.example.registerapi.dto;

import com.sun.istack.NotNull;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

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
    @Size(min=10,message="Password must be of 10 digits")
    private String password;
}
