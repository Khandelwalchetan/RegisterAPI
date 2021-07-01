package com.example.registerapi.entities;

import com.example.registerapi.dto.RegisterDto;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name="UserDetails")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String email;

    private String password;

    public User(RegisterDto registerDto) {
        this.name = registerDto.getName();
        this.email = registerDto.getEmail();
        this.password = registerDto.getPassword();
    }
}

