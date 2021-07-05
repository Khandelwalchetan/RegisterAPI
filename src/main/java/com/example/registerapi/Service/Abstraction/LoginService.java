package com.example.registerapi.Service.Abstraction;

import com.example.registerapi.Dto.LoginDto;

public interface LoginService {

    public boolean isAuthenticated(LoginDto loginDto);
}
