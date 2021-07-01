package com.example.registerapi.Service;

import com.example.registerapi.dto.LoginDto;

public interface LoginService {

    public boolean isAuthenticated(LoginDto loginDto);


}
