package com.example.registerapi.Dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class LoginDto {
    private String email;
    private String password;
}
