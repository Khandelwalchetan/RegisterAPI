package com.example.registerapi.entities;

import com.example.registerapi.Dto.RegisterDto;
import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="UserDetails")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    private String name;


    private String email;


    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User() {
        super();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User(RegisterDto registerDto) {
        this.name = registerDto.getName();
        this.email = registerDto.getEmail();
        this.password = registerDto.getPassword();
    }




}

