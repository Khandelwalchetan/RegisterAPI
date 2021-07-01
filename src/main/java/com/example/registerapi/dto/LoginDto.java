package com.example.registerapi.dto;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class LoginDto {
    private String email;
    private String password;
}
